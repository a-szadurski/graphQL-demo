package graphqldemo.service;

import graphqldemo.dto.AddPlayerCharacterInput;
import graphqldemo.dto.UpdatePlayerCharacterInput;
import graphqldemo.model.PlayerCharacter;

import java.util.List;

public interface PlayerCharacterService {

    PlayerCharacter findPlayerCharacterById(Integer id);

    List<PlayerCharacter> listPlayerCharacters();

    int addPlayerCharacter(AddPlayerCharacterInput input);

    PlayerCharacter updateCharacterClass(UpdatePlayerCharacterInput input);

    PlayerCharacter deleteCharacterClass(int id);
}
