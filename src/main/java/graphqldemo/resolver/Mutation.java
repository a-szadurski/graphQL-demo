package graphqldemo.resolver;

import graphql.kickstart.tools.GraphQLMutationResolver;
import graphqldemo.model.CharacterClass;
import graphqldemo.model.Player;
import graphqldemo.model.PlayerCharacter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Mutation implements GraphQLMutationResolver {

    public int addPlayer(String playerName) {
        return 0;
    }

    public Player updatePlayer(Long id, String playerName) {
        return new Player();
    }

    public Player deletePlayer(Long id) {
        return new Player();
    }

    public int addPlayerCharacter(String characterName, Long characterClassId) {
        return 0;
    }

    public PlayerCharacter updatePlayerCharacter(Long id, String characterName, Long characterClassId) {
        return new PlayerCharacter();
    }

    public PlayerCharacter deletePlayerCharacter(Long id) {
        return new PlayerCharacter();
    }

    public int addCharacterClass(String className, String characterClassDescription) {
        return 0;
    }

    public CharacterClass updateCharacterClass(Long id, String characterClassName, String CharacterClassDescription) {
        return new CharacterClass();
    }

    public CharacterClass deleteCharacterClass(Long id) {
        return new CharacterClass();
    }
}
