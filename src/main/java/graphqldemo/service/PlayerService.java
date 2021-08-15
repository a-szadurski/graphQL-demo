package graphqldemo.service;

import graphqldemo.model.Player;

import java.util.List;

public interface PlayerService {

    Player findPlayerById(Integer id);

    Player findPlayerByName(String name);

    List<Player> listPlayers();
}
