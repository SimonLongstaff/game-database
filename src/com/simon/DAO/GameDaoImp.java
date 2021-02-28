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
		Query<Game> query = currentSession.createQuery("from Game", Game.class);
		
		
		//Execute Query
		List<Game> games = query.getResultList();
		
		
		//return result
		return games;
		
	}

}
