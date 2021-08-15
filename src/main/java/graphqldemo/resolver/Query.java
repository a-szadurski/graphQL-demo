package graphqldemo.resolver;

import graphql.kickstart.tools.GraphQLQueryResolver;
import graphqldemo.model.Player;
import graphqldemo.service.PlayerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class Query implements GraphQLQueryResolver {

    private final PlayerService playerService;

    public Query(PlayerService playerService) {
        this.playerService = playerService;
    }

    public Player player(int id) {
        log.info("Retrieving player information by id");

        return playerService.findPlayerById(id);
    }

    public Player playerByName(String playerName) {
        log.info("Retrieving player information by name");
        return playerService.findPlayerByName(playerName);
    }

    public List<Player> listPlayers() {
        log.info("Listing all players");
        return playerService.listPlayers();
    }

//    public CharacterClass characterClass(String id) {
//        return new CharacterClass();
//    }
//
//    public List<CharacterClass> listCharacterClasses() {
//        return new ArrayList<>();
//    }
//
//    public PlayerCharacter playerCharacter(String id) {
//        return new PlayerCharacter();
//    }
//
//    public List<PlayerCharacter> listPlayerCharacters() {
//        return new ArrayList<>();
//    }

}
