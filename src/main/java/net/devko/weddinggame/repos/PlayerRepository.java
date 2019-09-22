package net.devko.weddinggame.repos;

import net.devko.weddinggame.entities.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, Long> {
}
