package com.simon.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="gameinfo")
public class Game {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="gameid" , nullable=false)
	private int id;
	
	@Column(name="gamename", nullable=false)
	private String name;
	
	@Column(name="gamestatus", nullable=false)
	private String status;
	
	@Column(name="gameplatform")
	private String platform;
	
	public Game() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	@Override
	public String toString() {
		return "Game [id=" + id + ", name=" + name + ", status=" + status + ", platform=" + platform + "]";
	}
	
	
	

}
