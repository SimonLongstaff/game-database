package com.simon.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.simon.entity.Game;

@Service
public interface GameService {
	
	public List<Game> getGames();

	public void saveGame(Game game);

	public Game getGame(int id);

	public void deleteGame(int id);
}
