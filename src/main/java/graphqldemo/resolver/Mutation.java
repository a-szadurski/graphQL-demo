package graphqldemo.resolver;

import graphql.kickstart.tools.GraphQLMutationResolver;
import graphqldemo.dto.AddPlayerInput;
import graphqldemo.dto.UpdatePlayerInput;
import graphqldemo.model.Player;
import graphqldemo.service.PlayerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Mutation implements GraphQLMutationResolver {

    private final PlayerService playerService;

    public Mutation(PlayerService playerService) {
        this.playerService = playerService;
    }

    public int addPlayer(AddPlayerInput input) {
        log.info("Adding player with the name: {}", input.getPlayerName());
        return playerService.addPlayer(input);
    }

    public Player updatePlayer(UpdatePlayerInput input) {
        return playerService.updatePlayer(input);
    }

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
