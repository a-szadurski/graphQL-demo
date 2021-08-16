package graphqldemo.service;

import graphqldemo.dto.AddPlayerInput;
import graphqldemo.dto.UpdatePlayerInput;
import graphqldemo.model.Player;
import graphqldemo.repository.PlayerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class PlayerServiceImpl implements PlayerService {

    private final String PLAYER_NOT_FOUND = "Error - player not found";

    private final PlayerRepository playerRepository;

    public PlayerServiceImpl(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }


    @Override
    public Player findPlayerById(Integer id) {

        Optional<Player> playerOptional = playerRepository.findById(id);
        return playerOptional.orElse(new Player(PLAYER_NOT_FOUND));
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
