package ie.julianstownlodge.necromundaxpcounterbe.dao;

import ie.julianstownlodge.necromundaxpcounterbe.dao.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, String> {

    Optional<UserEntity> findByUuid(String Id);
}
