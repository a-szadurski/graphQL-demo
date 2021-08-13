package graphqldemo.service;

import graphqldemo.model.Player;

public interface PlayerService {

    Player findPlayerById(Integer id);

    Player findPlayerByName(String name);
}
