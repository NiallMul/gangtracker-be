package ie.julianstownlodge.necromundaxpcounterbe.mappers;

import ie.julianstownlodge.necromundaxpcounterbe.dao.entities.FighterEntity;
import ie.julianstownlodge.necromundaxpcounterbe.model.Fighter;
import org.mapstruct.*;

import java.util.UUID;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT)
public abstract class FighterMapper {

    @Mapping(target = "classname", source = "className")
    public abstract FighterEntity modelToEntity(Fighter model);

    @InheritInverseConfiguration
    public abstract Fighter entityToModel(FighterEntity entity);

    @AfterMapping
    public void uuidCheck(@MappingTarget FighterEntity entity) {
        if (entity.getUuid().isEmpty()) {
            entity.setUuid(UUID.randomUUID().toString());
        }
    }
}
