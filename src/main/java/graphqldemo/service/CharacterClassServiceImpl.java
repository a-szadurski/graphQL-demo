package graphqldemo.service;

import graphqldemo.dto.character_class.AddCharacterClassInput;
import graphqldemo.dto.character_class.UpdateCharacterClassInput;
import graphqldemo.model.CharacterClass;
import graphqldemo.repository.CharacterClassRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterClassServiceImpl implements CharacterClassService {

    private final CharacterClassRepository characterClassRepository;

    public CharacterClassServiceImpl(CharacterClassRepository characterClassRepository) {
        this.characterClassRepository = characterClassRepository;
    }


    @Override
    public CharacterClass findCharacterClassById(Integer id) {
        return characterClassRepository.findById((int) id);
    }

    @Override
    public List<CharacterClass> listCharacterClasses() {
        return characterClassRepository.findAll();
    }

    @Override
    public int addCharacterClass(AddCharacterClassInput input) {
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
