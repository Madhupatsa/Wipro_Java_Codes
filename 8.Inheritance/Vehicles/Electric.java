package com;

public class Electric extends Engine {
	String currentType;
	int voltage;
	public Electric(String engineType,String model,int displacement,int maxPower,int maxRpm,int maxTorque,int weight,
			int cylinders,String compRatio,String currentType,int voltage) {
		super(engineType,model,displacement,maxPower,maxRpm,maxTorque,weight,cylinders,compRatio);
		this.currentType=currentType;
		this.voltage=voltage;
		
		
	}
	public void displaySpec() {
		System.out.println("Engine type:"+"Petrol Engine");
		System.out.println("Power Source:"+this.engineType);
		System.out.println("Engine model"+this.model);
	}

}
