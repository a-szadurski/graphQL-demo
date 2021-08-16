package graphqldemo.repository;

import graphqldemo.model.CharacterClass;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface CharacterClassRepository extends JpaRepository<CharacterClass, Integer> {

    @Transactional
    CharacterClass findById(int id);

    CharacterClass deleteById(int id);
}
