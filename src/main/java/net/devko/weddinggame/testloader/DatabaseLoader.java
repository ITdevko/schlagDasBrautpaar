package net.devko.weddinggame.testloader;

import net.devko.weddinggame.entities.Player;
import net.devko.weddinggame.repos.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final PlayerRepository repository;

    @Autowired
    public DatabaseLoader(PlayerRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Player(1L, "Tobi", 0));
        this.repository.save(new Player(2L, "July", 1));
    }

}
