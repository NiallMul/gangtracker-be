package ie.julianstownlodge.necromundaxpcounterbe.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserProfile {
    private String uuid;
    private String name;
    private String password;
}
