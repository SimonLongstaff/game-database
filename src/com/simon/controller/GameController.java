package com.simon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.simon.DAO.GameDAO;
import com.simon.entity.Game;
import com.simon.service.GameService;

@Controller
@RequestMapping("/game")
public class GameController {
	
	@Autowired
	GameService gameService;

	
	
	
	@GetMapping("/list")
	public String listGames(Model theModel) {
		
		//get games from service
		List<Game> games = gameService.getGames();
		
		
		//add games to model
		theModel.addAttribute("games", games);
		
		
		return "list-games";
	}
	
	

}
