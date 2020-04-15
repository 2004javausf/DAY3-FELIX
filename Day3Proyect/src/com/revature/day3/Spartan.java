package com.revature.day3;

public class Spartan {

	private int health;
	private String spartanName;
	private int weight;
	
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getSpartanName() {
		return spartanName;
	}
	public void setSpartanName(String spartanName) {
		this.spartanName = spartanName;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Spartan [health=" + health + ", spartanName=" + spartanName + ", weight=" + weight + "]";
	}
	
	
}
