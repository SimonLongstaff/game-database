package com.simon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.simon.DAO.GameDAO;
import com.simon.entity.Game;

@Service
public class GameServiceImpl implements GameService {

	@Autowired
	private GameDAO gameDAO;
	
	
	
	@Override
	@Transactional
	public List<Game> getGames() {
		return gameDAO.getGames();
	}



	@Override
	@Transactional
	public void saveGame(Game game) {
		
		gameDAO.saveGame(game);
	}



	@Override
	@Transactional
	public Game getGame(int id) {
	
		return gameDAO.getGame(id);
	}



	@Override
	@Transactional
	public void deleteGame(int id) {
		gameDAO.deleteGame(id);
		
	}
	
	

}
