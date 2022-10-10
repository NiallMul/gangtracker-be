package ie.julianstownlodge.necromundaxpcounterbe.dao.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "fighters")
public class FighterEntity {
    @Id
    private String uuid;
    private String name;
    private String classname;
    private String description;
}
