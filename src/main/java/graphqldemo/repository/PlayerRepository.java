package graphqldemo.repository;

import graphqldemo.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

    Player findByPlayerName(String name);

    @Transactional
    Player findById(int id);

    Player deleteById(int id);
}
