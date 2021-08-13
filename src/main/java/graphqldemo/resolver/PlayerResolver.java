package graphqldemo.resolver;

import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import graphqldemo.model.Player;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class PlayerResolver implements GraphQLQueryResolver, GraphQLMutationResolver {

    public Player player(Long id) {
        log.info("Retrieving player information");
        return new Player();
    }

    public List<Player> listPlayers() {
        return new ArrayList<>();
    }

    public int addPlayer(String playerName) {
        return 0;
    }

    public Player updatePlayer(Long id, String playerName) {
        return new Player();
    }

    public Player deletePlayer(Long id) {
        return new Player();
    }

}
