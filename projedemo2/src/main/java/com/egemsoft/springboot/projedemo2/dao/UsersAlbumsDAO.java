package com.egemsoft.springboot.projedemo2.dao;

import java.util.List;

import com.egemsoft.springboot.projedemo2.entity.UserAlbums;
import com.egemsoft.springboot.projedemo2.entity.UserPhotos;

public interface UsersAlbumsDAO {
	
	public List<UserAlbums> getAlbums(int id);
	
	public List<UserPhotos> getPhotos(int id);

}
