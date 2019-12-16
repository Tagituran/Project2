package com.egemsoft.springboot.projedemo2.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.egemsoft.springboot.projedemo2.entity.UserAlbums;
import com.egemsoft.springboot.projedemo2.entity.UserPhotos;
import com.egemsoft.springboot.projedemo2.service.UserAlbumsService;

@RestController
@RequestMapping("/xxx")
public class UserAlbumsRestController {
	

	
	private UserAlbumsService userAlbums;

	@Autowired
	public UserAlbumsRestController(UserAlbumsService userAlbums) {
		this.userAlbums = userAlbums;
	}
	
	
	@PutMapping("/userAlbums/{id}")
	public List<UserAlbums> getAlbums(@PathVariable int id) {
		
		
		List <UserAlbums> theUsers=userAlbums.getAlbums(id);
		
		//check the id if exist with if statement
		if(id>theUsers.size()||id<0) {
			throw new UserAlbumsNotFoundException("USER ID NOT FOUND  " +id);
		}
		
		
		return theUsers;
	}
	
	//Add an exception handler using annotation @ExceptionHandler
	@ExceptionHandler
	public ResponseEntity<UserAlbumsErrorResponse> handleException(UserAlbumsNotFoundException exc){
		
		//create a UserAlbumsErrorResponse
		
		UserAlbumsErrorResponse error= new UserAlbumsErrorResponse();
		
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(exc.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		
		//Return response Entity
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
		
	}
	
	
	//This one for question 5 /albumsWithDetails/id
	
	@PutMapping("/userAlbumsWithDetails/{id}")
	public List<UserPhotos> getPhotos(@PathVariable int id){
		
		List <UserPhotos> theUsers=userAlbums.getPhotos(id);
		
		if(id>theUsers.size()||id<0) {
			throw new UserAlbumsNotFoundException("USER PHOTOS AT THIS ID NOT FOUND:  " +id);
		}
		
		return theUsers;
	}

}
