package com.codingdojo.project1;

public class Mammal {
	protected int energyLevel;
	

	public Mammal(int energyLevel) {
		super();
		this.energyLevel = energyLevel;
	}


	public int getEnergyLevel() {
		return energyLevel;
	}


	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}


	public void showEnergy() {
		System.out.println("Remaining energy level:" +energyLevel);
	}
	
}	
