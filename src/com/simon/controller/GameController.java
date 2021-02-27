package com.simon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.simon.DAO.GameDAO;
import com.simon.DAO.GameDaoImp;
import com.simon.entity.Game;

@Controller
@RequestMapping("/game")
public class GameController {
	
	@Autowired
	private GameDAO gameDAO;
	
	
	
	
	@RequestMapping("/list")
	public String listGames(Model theModel) {
		
		//get games from DAO
		List<Game> games = gameDAO.getGames();
		
		
		//add games to model
		theModel.addAttribute("games", games);
		
		
		return "list-games";
	}
	
	

}
