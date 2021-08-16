package graphqldemo.resolver;

import graphql.kickstart.tools.GraphQLMutationResolver;
import graphqldemo.dto.AddCharacterClassInput;
import graphqldemo.dto.AddPlayerInput;
import graphqldemo.dto.UpdateCharacterClassInput;
import graphqldemo.dto.UpdatePlayerInput;
import graphqldemo.model.CharacterClass;
import graphqldemo.model.Player;
import graphqldemo.service.CharacterClassService;
import graphqldemo.service.PlayerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Mutation implements GraphQLMutationResolver {

    private final PlayerService playerService;
    private final CharacterClassService characterClassService;

    public Mutation(PlayerService playerService, CharacterClassService characterClassService) {
        this.playerService = playerService;
        this.characterClassService = characterClassService;
    }

    public int addPlayer(AddPlayerInput input) {
        log.info("Adding player with the name: {}", input.getPlayerName());
        return playerService.addPlayer(input);
    }

    public Player updatePlayer(UpdatePlayerInput input) {
        log.info("Updating player with the id: {}", input.getId());
        return playerService.updatePlayer(input);
    }

    public Player deletePlayer(Integer id) {
        log.info("Deleting player with the id: {}", id);
        return playerService.deletePlayer(id);
    }

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

    public int addCharacterClass(AddCharacterClassInput input) {
        log.info("Adding player with the name: {}, description: {}", input.getCharacterClassName(), input.getCharacterClassDescription());
        return characterClassService.addCharacterClass(input);
    }

    public CharacterClass updateCharacterClass(UpdateCharacterClassInput input) {
        log.info("Updating character class with the id: {}", input.getId());
        return characterClassService.updateCharacterClass(input);
    }

    public CharacterClass deleteCharacterClass(Integer id) {
        log.info("Deleting character class with the id: {}", id);
        return characterClassService.deleteCharacterClass(id);
    }
}
