package com.pongelupe.albunsSpotify.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Artist {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int artistId;
	
	private String name;
	private boolean isAlive;

	
	@JoinColumn(name = "id_album")
	@OneToMany(cascade = CascadeType.ALL)
	private List<Album> albuns;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public List<Album> getAlbuns() {
		return albuns;
	}

	public void setAlbuns(List<Album> albuns) {
		this.albuns = albuns;
	}

}
