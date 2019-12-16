package com.egemsoft.springboot.projedemo2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.egemsoft.springboot.projedemo2.dao.UsersAlbumsDAO;
import com.egemsoft.springboot.projedemo2.entity.UserAlbums;
import com.egemsoft.springboot.projedemo2.entity.UserPhotos;

@Service
public class UserAlbumsServiceHibernateImplementation implements UserAlbumsService {

	private UsersAlbumsDAO userAlbums;
	
	
	
	public UserAlbumsServiceHibernateImplementation() {
	}



	@Autowired
	public UserAlbumsServiceHibernateImplementation(UsersAlbumsDAO userAlbums) {
		this.userAlbums = userAlbums;
	}



	@Override
	@Transactional
	public List<UserAlbums> getAlbums(int id) {
		
		List <UserAlbums> theUsers=userAlbums.getAlbums(id);
		
		return theUsers;
	}
	
	@Override
	@Transactional
	public List<UserPhotos> getPhotos(int id) {
		
		List <UserPhotos> theUsers=userAlbums.getPhotos(id);
		
		return theUsers;
	}
	
	

}
