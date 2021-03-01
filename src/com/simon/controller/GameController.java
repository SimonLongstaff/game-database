package com.simon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.simon.entity.Game;
import com.simon.service.GameService;

@Controller
@RequestMapping("/game")
public class GameController {
	
	@Autowired
	GameService gameService;

	
	
	
	@GetMapping("/list")
	public String listGames(Model model) {
		
		//get games from service
		List<Game> games = gameService.getGames();
		
		
		//add games to model
		model.addAttribute("games", games);
		
		
		return "list-games";
	}
	
	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		
		model.addAttribute("game", new Game()); 
		
		return "game-form";
		}
	
	@PostMapping("/saveGame")
	public String saveGame(@ModelAttribute("game") Game game) {
		
		gameService.saveGame(game);
		
		return "redirect:/game/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("gameid") int id, Model model) {
		
		//get game
		
		Game game = gameService.getGame(id);
		
		//set retrieved game as attribute
		model.addAttribute("game", game);
		
		
		//send to form
		
		return "game-form";
	}
	
	@GetMapping("/delete")
	public String deleteGame(@RequestParam("gameid") int id) {
		
		gameService.deleteGame(id);
		
		return "redirect:/game/list";	}

}
