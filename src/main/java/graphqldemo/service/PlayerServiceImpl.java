package graphqldemo.service;

import graphqldemo.model.Player;
import graphqldemo.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService {


    private final PlayerRepository playerRepository;

    public PlayerServiceImpl(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }


    @Override
    public Player findPlayerById(Integer id) {

        Optional<Player> playerOptional = playerRepository.findById(id);
        return playerOptional.orElse(new Player("Error - player not found"));
    }

    @Override
    public Player findPlayerByName(String name) {
        return playerRepository.findByPlayerName(name);
    }

    @Override
    public List<Player> listPlayers() {
        return playerRepository.findAll();
    }
}
