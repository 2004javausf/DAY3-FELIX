package com.maurie.driver;

import com.revature.day3.Soldier;
import com.revature.day3.Spartan;

public class Driver {
	public static void main(String[] args) {
		
		Soldier h = new Soldier();
		System.out.println(h);
		h.setHealth(85);
		h.setSoldierName("Hank Hill");
		h.setWeight(270);
		System.out.println("Soldier [health=" + h.getHealth() + ", soldierName=" + h.getSoldierName() + ", weight=" + h.getWeight() + "]");
		
		System.out.println("");
		Spartan m = new Spartan();
		System.out.println(h);
		m.setHealth(54);
		m.setSpartanName("Leonidas");
		m.setWeight(170);
		System.out.println("Spartan [health=" + m.getHealth() + ", soldierName=" + m.getSpartanName() + ", weight=" + m.getWeight() + "]");
	}
}
