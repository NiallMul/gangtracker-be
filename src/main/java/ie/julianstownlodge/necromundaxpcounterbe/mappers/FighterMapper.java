package ie.julianstownlodge.necromundaxpcounterbe.mappers;

import ie.julianstownlodge.necromundaxpcounterbe.dao.entities.FighterEntity;
import ie.julianstownlodge.necromundaxpcounterbe.model.Fighter;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT)
public interface FighterMapper {

    @Mapping(target = "classname", source = "className")
    FighterEntity modelToEntity(Fighter model);

    @InheritInverseConfiguration
    Fighter entityToModel(FighterEntity entity);
}
