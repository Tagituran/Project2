package com.egemsoft.springboot.projedemo2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usersalbums")
public class UserAlbums {
	
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	
	@Column(name="userid")
	private int userId;
	
	
	@Column(name="title")
	private String title;
	
	
	
	public UserAlbums() {
		
		
	}


	public UserAlbums(int userId, String title) {
		this.userId = userId;
		this.title = title;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	@Override
	public String toString() {
		return "UserAlbums [id=" + id + ", userId=" + userId + ", title=" + title + "]";
	}
	
	

}
