package com.simon.DAO;

import java.util.*;
import com.simon.entity.*;

public interface GameDAO {
	
	public List<Game> getGames();

	public void saveGame(Game game);

	public Game getGame(int id);

	public void deleteGame(int id);

}