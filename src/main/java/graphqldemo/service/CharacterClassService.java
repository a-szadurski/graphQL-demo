package graphqldemo.service;

import graphqldemo.dto.character_class.AddCharacterClassInput;
import graphqldemo.dto.character_class.UpdateCharacterClassInput;
import graphqldemo.model.CharacterClass;

import java.util.List;

public interface CharacterClassService {

    CharacterClass findCharacterClassById(Integer id);

    List<CharacterClass> listCharacterClasses();

    int addCharacterClass(AddCharacterClassInput input);

    CharacterClass updateCharacterClass(UpdateCharacterClassInput input);

    CharacterClass deleteCharacterClass(int id);
}
