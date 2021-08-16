package graphqldemo.service;

import graphqldemo.dto.AddCharacterClassInput;
import graphqldemo.dto.UpdateCharacterClassInput;
import graphqldemo.model.CharacterClass;

import java.util.List;

public interface CharacterClassService {

    CharacterClass findCharacterClassById(Integer id);

    List<CharacterClass> listCharacterClasses();

    int addCharacterClass(AddCharacterClassInput input);

    CharacterClass updateCharacterClass(UpdateCharacterClassInput input);

    CharacterClass deleteCharacterClass(int id);
}
