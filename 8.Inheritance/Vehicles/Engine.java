package com;

public class Engine {
	String model;
	int displacement;
	int maxPower;
	int maxRpm;
	int maxTorque;
	int weight;
	int cylinders;
	String compRatio;
	String engineType;
    
	public Engine(String engineType,String model,int displacement,int maxPower,int maxRpm,int maxTorque,int weight,int cylinders,String compRatio){
		//super();
		this.model=model;
		this.engineType=engineType;
		this.displacement=displacement;
		this.maxPower=maxPower;
		this.maxRpm=maxRpm;
		this.maxTorque=maxTorque;
		this.weight=weight;
		this.cylinders=cylinders;
		this.compRatio=compRatio;
	}
}
