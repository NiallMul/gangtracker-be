package ie.julianstownlodge.necromundaxpcounterbe.service;

import ie.julianstownlodge.necromundaxpcounterbe.model.UserProfile;

public interface UserService {
    UserProfile getUser(String id);

    void createUser(UserProfile userProfile);
}
