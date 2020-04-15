package com.revature.day3;

public class Driver 
{
	public static void main(String[] args)
	{
		Spartan newSpartan = new Spartan();
		newSpartan.setHealth(100);
		newSpartan.setSpartanName("John");
		newSpartan.setWeight(180);
		
		System.out.println("Welcome Spartan");
		System.out.println("Health " + newSpartan.getHealth());
		System.out.println("Spartan Name " + newSpartan.getSpartanName());
		System.out.println("Weight " + newSpartan.getWeight());
	}
}
