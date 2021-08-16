package graphqldemo.resolver;

import graphql.kickstart.tools.GraphQLQueryResolver;
import graphqldemo.model.CharacterClass;
import graphqldemo.model.Player;
import graphqldemo.model.PlayerCharacter;
import graphqldemo.service.CharacterClassService;
import graphqldemo.service.PlayerCharacterService;
import graphqldemo.service.PlayerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class Query implements GraphQLQueryResolver {

    private final PlayerService playerService;
    private final CharacterClassService characterClassService;
    private final PlayerCharacterService playerCharacterService;

    public Query(PlayerService playerService, CharacterClassService characterClassService, PlayerCharacterService playerCharacterService) {
        this.playerService = playerService;
        this.characterClassService = characterClassService;
        this.playerCharacterService = playerCharacterService;
    }

    public Player player(int id) {
        log.info("Retrieving player information by id: {}", id);
        return playerService.findPlayerById(id);
    }

    public Player playerByName(String playerName) {
        log.info("Retrieving player information by name: {}", playerName);
        return playerService.findPlayerByName(playerName);
    }

    public List<Player> listPlayers() {
        log.info("Listing all players");
        return playerService.listPlayers();
    }

    public CharacterClass characterClass(Integer id) {
        log.info("Retrieving character class information by id: {}", id);
        return characterClassService.findCharacterClassById(id);
    }

    public List<CharacterClass> listCharacterClasses() {
        log.info("Listing all character classes");
        return characterClassService.listCharacterClasses();
    }

    public PlayerCharacter playerCharacter(Integer id) {
        log.info("Retrieving player character information by id: {}", id);
        return playerCharacterService.findPlayerCharacterById(id);
    }

    public List<PlayerCharacter> listPlayerCharacters() {
        log.info("Listing all player characters");
        return playerCharacterService.listPlayerCharacters();
    }

}
