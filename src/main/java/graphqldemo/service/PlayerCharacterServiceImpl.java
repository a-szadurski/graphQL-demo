package graphqldemo.service;

import graphqldemo.dto.AddPlayerCharacterInput;
import graphqldemo.dto.UpdatePlayerCharacterInput;
import graphqldemo.model.PlayerCharacter;
import graphqldemo.repository.PlayerCharacterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerCharacterServiceImpl implements PlayerCharacterService {

    private final PlayerCharacterRepository playerCharacterRepository;

    public PlayerCharacterServiceImpl(PlayerCharacterRepository playerCharacterRepository) {
        this.playerCharacterRepository = playerCharacterRepository;
    }

    @Override
    public PlayerCharacter findPlayerCharacterById(Integer id) {
        return playerCharacterRepository.findById((int) id);
    }

    @Override
    public List<PlayerCharacter> listPlayerCharacters() {
        return playerCharacterRepository.findAll();
    }

    @Override
    public int addPlayerCharacter(AddPlayerCharacterInput input) {
        return 0;
    }

    @Override
    public PlayerCharacter updateCharacterClass(UpdatePlayerCharacterInput input) {
        return null;
    }

    @Override
    public PlayerCharacter deleteCharacterClass(int id) {
        return null;
    }
}
