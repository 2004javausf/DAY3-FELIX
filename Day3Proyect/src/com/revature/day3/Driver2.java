package com.revature.day3
public class Driver2
{
	public static void main(String[] args)
	{
		Spartan newSpartanTwo = new Spartan();
		newSpartanTwo.setHealth(100);
		newSpartanTwo.setSpartanName("John");
		newSpartanTwo.setWeight(180);
		
		System.out.println("Welcome Spartan");
		System.out.println("Health " + newSpartanTwo.getHealth());
		System.out.println("Spartan Name " + newSpartanTwo.getSpartanName());
		System.out.println("Weight " + newSpartanTwo.getWeight());
	}
}