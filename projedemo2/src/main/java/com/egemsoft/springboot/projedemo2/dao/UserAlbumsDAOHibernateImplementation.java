package com.egemsoft.springboot.projedemo2.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.egemsoft.springboot.projedemo2.entity.UserAlbums;
import com.egemsoft.springboot.projedemo2.entity.UserPhotos;

@Repository
public class UserAlbumsDAOHibernateImplementation implements UsersAlbumsDAO{

	private EntityManager entityManager;
	
	
	@Autowired
	public UserAlbumsDAOHibernateImplementation(EntityManager entityManager) {
		this.entityManager = entityManager;
	}



	@Override
	public List<UserAlbums> getAlbums(int id) {
		
		Session currentSession=entityManager.unwrap(Session.class);
		
		Query<UserAlbums> theQuery=
				currentSession.createQuery("from UserAlbums where id= :id", UserAlbums.class).setParameter("id", id);
		
		List<UserAlbums> users=theQuery.getResultList();
		
		
		return users;
	}



	@Override
	public List<UserPhotos> getPhotos(int id) {

		Session currentSession=entityManager.unwrap(Session.class);
		
		Query<UserPhotos> theQuery=
				currentSession.createQuery("from UserAlbums where id= :id", UserPhotos.class).setParameter("id", id);
		
		List<UserPhotos> users=theQuery.getResultList();

		
		return users;
	}





}
