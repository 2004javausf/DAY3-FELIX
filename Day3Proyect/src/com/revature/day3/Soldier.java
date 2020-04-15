package com.revature.day3;

public class Soldier 
{
	private int health;
	private String soldierName;
	private int weight;
	
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getSoldierName() {
		return soldierName;
	}
	public void setSoldierName(String soldierName) {
		this.soldierName = soldierName;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Soldier [health=" + health + ", soldierName=" + soldierName + ", weight=" + weight + "]";
	}
	
	
	
}
