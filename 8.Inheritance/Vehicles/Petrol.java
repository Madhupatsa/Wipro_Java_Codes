package com;

public class Petrol extends Engine{
	public Petrol(String engineType,String model,int displacement,int maxPower,int maxRpm,int maxTorque,int weight,
			int cylinders,String compRatio) {
		super(engineType,model,displacement,maxPower,maxRpm,maxTorque,weight,cylinders,compRatio);
		
	}
	public void displaySpec() {
		
		System.out.println("Engine type:"+"Petrol Engine");
		System.out.println("Power Source:"+this.engineType);
		System.out.println("Engine model"+this.model);
	}
}
