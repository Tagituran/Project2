package com.egemsoft.springboot.projedemo2.service;

import java.util.List;

import com.egemsoft.springboot.projedemo2.entity.UserAlbums;
import com.egemsoft.springboot.projedemo2.entity.UserPhotos;

public interface UserAlbumsService {
	
	public List<UserAlbums> getAlbums(int id);
	
	public List<UserPhotos> getPhotos(int id);

}
