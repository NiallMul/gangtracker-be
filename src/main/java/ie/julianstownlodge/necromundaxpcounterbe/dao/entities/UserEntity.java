package ie.julianstownlodge.necromundaxpcounterbe.dao.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "users")
public class UserEntity {
    @Id
    private String uuid;
    private String name;
    private String password;
}
