package graphqldemo.service;

import graphqldemo.dto.AddCharacterClassInput;
import graphqldemo.dto.UpdateCharacterClassInput;
import graphqldemo.model.CharacterClass;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterClassServiceImpl implements CharacterClassService{

    @Override
    public CharacterClass findCharacterClassById(Integer id) {
        return null;
    }

    @Override
    public CharacterClass findCharacterClassByName(String name) {
        return null;
    }

    @Override
    public List<CharacterClass> listCharacterClasses() {
        return null;
    }

    @Override
    public int addPlayer(AddCharacterClassInput input) {
        return 0;
    }

    @Override
    public CharacterClass updateCharacterClass(UpdateCharacterClassInput input) {
        return null;
    }

    @Override
    public CharacterClass deleteCharacterClass(int id) {
        return null;
    }
}
