package graphqldemo.resolver;

import graphql.kickstart.tools.GraphQLQueryResolver;
import graphqldemo.model.CharacterClass;
import graphqldemo.model.Player;
import graphqldemo.model.PlayerCharacter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class Query implements GraphQLQueryResolver {

    public Player player(Long id) {
        log.info("Retrieving player information");
        return new Player();
    }

    public List<Player> listPlayers() {
        return new ArrayList<>();
    }

    public CharacterClass characterClass(Long id) {
        return new CharacterClass();
    }

    public List<CharacterClass> listCharacterClasses() {
        return new ArrayList<>();
    }

    public PlayerCharacter playerCharacter(Long id) {
        return new PlayerCharacter();
    }

    public List<PlayerCharacter> listPlayerCharacters() {
        return new ArrayList<>();
    }

}
