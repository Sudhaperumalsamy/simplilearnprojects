package com.to;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity

@Table
public class Player {
	@Id
	private int playerid;
	private String playerName;
	private String teamName;
	private int age;
	public int getPlayerid() {
		return playerid;
	}
	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Player [playerid=" + playerid + ", playerName=" + playerName + ", teamName=" + teamName + ", age=" + age
				+ "]";
	}
	public Player(int playerid, String playerName, String teamName, int age) {
		super();
		this.playerid = playerid;
		this.playerName = playerName;
		this.teamName = teamName;
		this.age = age;
	}
	
	

	

}
