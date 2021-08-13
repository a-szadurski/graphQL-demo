package graphqldemo.resolver;

import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Mutation implements GraphQLMutationResolver {

    public int addPlayer(String playerName) {
        return 0;
    }

//    public Player updatePlayer(String id, String playerName) {
//        return new Player();
//    }
//
//    public Player deletePlayer(String id) {
//        return new Player();
//    }
//
//    public Player addPlayerCharacter(String characterName, String characterClassId) {
//        return new Player();
//    }
//
//    public PlayerCharacter updatePlayerCharacter(String id, String characterName, String characterClassId) {
//        return new PlayerCharacter();
//    }
//
//    public PlayerCharacter deletePlayerCharacter(String id) {
//        return new PlayerCharacter();
//    }
//
//    public int addCharacterClass(String className, String characterClassDescription) {
//        return 0;
//    }
//
//    public CharacterClass updateCharacterClass(String id, String characterClassName, String CharacterClassDescription) {
//        return new CharacterClass();
//    }
//
//    public CharacterClass deleteCharacterClass(String id) {
//        return new CharacterClass();
//    }
}
