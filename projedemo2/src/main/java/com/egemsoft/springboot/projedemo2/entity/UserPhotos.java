package com.egemsoft.springboot.projedemo2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userphotos")
public class UserPhotos {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="albumid")
	private int albumId;
	
	@Column(name="title")
	private	String title;
	
	@Column(name="url")
	private String url;
	
	@Column(name="thumbnailUrl")
	private String thumbnailUrl;

	public UserPhotos() {
	}

	public UserPhotos(int albumId, String title, String url, String thumbnailUrl) {
		this.albumId = albumId;
		this.title = title;
		this.url = url;
		this.thumbnailUrl = thumbnailUrl;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAlbumId() {
		return albumId;
	}

	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getThumbnailUrl() {
		return thumbnailUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

	@Override
	public String toString() {
		return "UserPhotos [id=" + id + ", albumId=" + albumId + ", title=" + title + ", url=" + url + ", thumbnailUrl="
				+ thumbnailUrl + "]";
	}
	
	
	
	

}
