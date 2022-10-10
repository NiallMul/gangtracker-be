package ie.julianstownlodge.necromundaxpcounterbe.dao;

import ie.julianstownlodge.necromundaxpcounterbe.dao.entities.FighterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FighterListRepository extends JpaRepository<FighterEntity, String> {
    Optional<FighterEntity> findByUuid(String Id);
}
