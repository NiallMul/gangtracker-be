package ie.julianstownlodge.necromundaxpcounterbe.mappers;

import ie.julianstownlodge.necromundaxpcounterbe.dao.entities.UserEntity;
import ie.julianstownlodge.necromundaxpcounterbe.model.UserProfile;
import org.mapstruct.*;

import java.util.UUID;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT)
public abstract class UserMapper {
    public abstract UserEntity modelToEntity(UserProfile model);

    public abstract UserProfile entityToModel(UserEntity entity);

    @AfterMapping
    public void uuidCheck(@MappingTarget UserEntity entity) {
        if (entity.getUuid().isEmpty()) {
            entity.setUuid(UUID.randomUUID().toString());
        }
    }
}
