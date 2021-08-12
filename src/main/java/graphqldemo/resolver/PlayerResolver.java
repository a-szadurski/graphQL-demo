package graphqldemo.resolver;

import graphql.kickstart.tools.GraphQLQueryResolver;
import graphqldemo.model.Player;
import graphqldemo.model.PlayerCharacter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.UUID;

@Slf4j
@Component
public class PlayerResolver implements GraphQLQueryResolver {

    public Player player(UUID id) {
        log.info("Retrieving player information");
        return Player.builder().id(1L).playerName("First Player").playerCharacter(new ArrayList<PlayerCharacter>()).build();
    }

}
