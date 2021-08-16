package graphqldemo.service;

import graphqldemo.dto.player_characer.AddPlayerCharacterInput;
import graphqldemo.dto.player_characer.UpdatePlayerCharacterInput;
import graphqldemo.model.PlayerCharacter;

import java.util.List;

public interface PlayerCharacterService {

    PlayerCharacter findPlayerCharacterById(Integer id);

    List<PlayerCharacter> listPlayerCharacters();

    int addPlayerCharacter(AddPlayerCharacterInput input);

    PlayerCharacter updateCharacterClass(UpdatePlayerCharacterInput input);

    PlayerCharacter deleteCharacterClass(int id);
}
