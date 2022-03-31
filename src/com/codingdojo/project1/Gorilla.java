package com.codingdojo.project1;

public class Gorilla extends Mammal{

	public Gorilla(int energyLevel) {
		super(energyLevel);
		
	}
	
	public void thowSomething() {
		System.out.println("The gorilla threw something");
		energyLevel -= 5;
		this.showEnergy();
	}
	
	public void eatBannanas() {
		System.out.println("The gorilla has eaten already.");
		energyLevel += 10;
		this.showEnergy();
	}
	
	public void climb() {
		System.out.println("The gorilla has climbed a tree.");
		energyLevel -= 10;
		this.showEnergy();
	}
	
	
}
