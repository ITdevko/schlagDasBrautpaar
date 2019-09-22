package net.devko.weddinggame.controller;

import net.devko.weddinggame.repos.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private final PlayerRepository playerRepository;

    @Autowired
    public HomeController(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @RequestMapping(value = "/game")
    public String index() {
        return "index";
    }

    @RequestMapping(value= "/players")
    public String players(Model model){
        model.addAttribute("players", playerRepository.findAll());
        return "players";
    }

}