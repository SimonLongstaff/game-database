package com.simon.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.simon.entity.Game;

@Repository
public class GameDaoImp implements GameDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Game> getGames() {
		
		
		
		//Get hibernate session
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		//Query
		Query<Game> query = currentSession.createQuery("from Game order by status", Game.class);
		
		
		//Execute Query
		List<Game> games = query.getResultList();
		
		
		//return result
		return games;
		
	}

	@Override
	public void saveGame(Game game) {
		
		//get hibernate sessions
		Session currentSession = sessionFactory.getCurrentSession();
		
		//save new entry
	
		currentSession.saveOrUpdate(game);
		
	}

	@Override
	public Game getGame(int id) {
		
		//get session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//read game from database
		Game game = currentSession.get(Game.class, id);
		
		return game;
		
	}

	@Override
	public void deleteGame(int id) {
		
		//get session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//delete game
		Query query = currentSession.createQuery("delete from Game where id=:id ");
		query.setParameter("id", id);
		
		query.executeUpdate();
		
		
	}

}
