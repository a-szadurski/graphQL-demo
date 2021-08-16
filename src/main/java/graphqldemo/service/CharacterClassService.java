package graphqldemo.service;

import graphqldemo.dto.AddCharacterClassInput;
import graphqldemo.dto.UpdateCharacterClassInput;
import graphqldemo.model.CharacterClass;

import java.util.List;

public interface CharacterClassService {

    CharacterClass findCharacterClassById(Integer id);

    CharacterClass findCharacterClassByName(String name);

    List<CharacterClass> listCharacterClasses();

    int addPlayer(AddCharacterClassInput input);

    CharacterClass updateCharacterClass(UpdateCharacterClassInput input);

    CharacterClass deleteCharacterClass(int id);
}
