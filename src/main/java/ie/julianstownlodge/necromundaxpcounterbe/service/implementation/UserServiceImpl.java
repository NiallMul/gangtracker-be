package ie.julianstownlodge.necromundaxpcounterbe.service.implementation;

import ie.julianstownlodge.necromundaxpcounterbe.dao.UserRepository;
import ie.julianstownlodge.necromundaxpcounterbe.dao.entities.UserEntity;
import ie.julianstownlodge.necromundaxpcounterbe.mappers.UserMapper;
import ie.julianstownlodge.necromundaxpcounterbe.model.UserProfile;
import ie.julianstownlodge.necromundaxpcounterbe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper mapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserMapper mapper) {
        this.userRepository = userRepository;
        this.mapper = mapper;
    }


    @Override
    public UserProfile getUser(String id) {
        return userRepository.findByUuid(id).map(mapper::entityToModel).orElse(null);
    }

    @Override
    public void createUser(UserProfile userProfile) {
        userRepository.save(mapper.modelToEntity(userProfile));
    }
}
