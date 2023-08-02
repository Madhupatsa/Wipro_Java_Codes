package com;

public class Desiel extends Engine {
	public Desiel(String engineType,String model,int displacement,int maxPower,int maxRpm,int maxTorque,int weight,
			int cylinders,String compRatio) {
		super(engineType,model,displacement,maxPower,maxRpm,maxTorque,weight,cylinders,compRatio);
		
	}
	public void displaySpec() {
		//Petrol petrol =new Petrol();
		System.out.println("Engine type:"+"Petrol Engine");
		System.out.println("Power Source:"+this.engineType);
		System.out.println("Engine model"+this.model);
	}

}
