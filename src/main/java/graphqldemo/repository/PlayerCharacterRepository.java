package graphqldemo.repository;

import graphqldemo.model.PlayerCharacter;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface PlayerCharacterRepository extends JpaRepository<PlayerCharacter, Integer> {

    @Transactional
    PlayerCharacter findById(int id);

    PlayerCharacter deleteById(int id);
}
