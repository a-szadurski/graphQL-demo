package graphqldemo.resolver;

import graphql.kickstart.tools.GraphQLQueryResolver;
import graphqldemo.model.Player;
import graphqldemo.service.PlayerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Query implements GraphQLQueryResolver {

    private final PlayerService playerService;

    public Query(PlayerService playerService) {
        this.playerService = playerService;
    }

    public Player player(int id) {
        log.info("Retrieving player information");

        return playerService.findPlayerById(id);
    }

    public Player playerByName(String playerName) {
        return playerService.findPlayerByName(playerName);
    }

//    public List<Player> listPlayers() {
//        return new ArrayList<>();
//    }
//
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
