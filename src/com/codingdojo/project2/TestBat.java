package com.codingdojo.project2;

public class TestBat {

	public static void main(String[] args) {
		
		Bat bat1 = new Bat();
		
		//Attack Village
		bat1.attackVillage();
		bat1.showEnergy();
		bat1.attackVillage();
		bat1.showEnergy();
		bat1.attackVillage();
		bat1.showEnergy();
		
		//Eat humans
		bat1.eatHumans();
		bat1.showEnergy();
		bat1.eatHumans();
		bat1.showEnergy();
		
		//Fly
		bat1.fly();
		bat1.showEnergy();
		bat1.fly();
		bat1.showEnergy();
	}

}
