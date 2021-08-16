package graphqldemo.service;

import graphqldemo.dto.AddPlayerInput;
import graphqldemo.dto.UpdatePlayerInput;
import graphqldemo.model.Player;
import graphqldemo.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerServiceImpl(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }


    @Override
    public Player findPlayerById(Integer id) {
        return playerRepository.findById((int) id);
    }

    @Override
    public Player findPlayerByName(String name) {
        return playerRepository.findByPlayerName(name);
    }

    @Override
    public List<Player> listPlayers() {
        return playerRepository.findAll();
    }

    @Override
    public int addPlayer(AddPlayerInput input) {
        Player player = Player.builder().playerName(input.getPlayerName()).build();
        return playerRepository.save(player).getId();
    }

    @Override
    public Player updatePlayer(UpdatePlayerInput input) {
        Player player = playerRepository.findById(input.getId());
        player.setPlayerName(input.getPlayerName());
        return playerRepository.save(player);
    }

    @Override
    public Player deletePlayer(int id) {
        return playerRepository.deleteById(id);
    }
}
