package com.codingdojo.project2;

import com.codingdojo.project1.Mammal;

public class Bat extends Mammal{

	public Bat() {
		super(300);
	}
	
	public void fly() {
		if(energyLevel < 50) {
			System.out.println("The amount of energy of the bat for this activity is not enough.");
		}else {
			System.out.println("Sounds of the bat flying");
			energyLevel-=50;
		}
		
	}
	
	public void eatHumans() {
		energyLevel+=25;
		
	}
	
	public void attackVillage(){
		if(energyLevel < 100) {
			System.out.println("The amount of energy of the bat for this activity is not enough.");
		}else {
			System.out.println("Sounds of a town on fire");
			energyLevel-=100;
		}
	}
	
}
