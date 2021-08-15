package graphqldemo.service;

import graphqldemo.dto.AddPlayerInput;
import graphqldemo.dto.UpdatePlayerInput;
import graphqldemo.model.Player;

import java.util.List;

public interface PlayerService {

    Player findPlayerById(Integer id);

    Player findPlayerByName(String name);

    List<Player> listPlayers();

    int addPlayer(AddPlayerInput input);

    Player updatePlayer(UpdatePlayerInput input);
}
