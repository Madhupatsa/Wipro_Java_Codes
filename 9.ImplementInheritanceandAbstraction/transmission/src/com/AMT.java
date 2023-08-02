package com;

public class AMT extends Transmission{
	AMT(String model){
		super(model);
	}
	void showSpec(String model) {
		System.out.println("Transmission Type is: AMT");
		 switch(model) {
		 case "AMT4": 
			 System.out.println("Transmission Model Number is: "+model);
			System.out.println("Key Specifications:");
			System.out.format("%s %10s","Forward gears are:","4\n");
			System.out.format("%s %10s","1st gear ratio:","2.540\n");
			System.out.format("%s %10s","2nd gear ratio:","1.920\n");
			System.out.format("%s %10s","3rd gear ratio:","1.510\n");
			System.out.format("%s %10s","4th gear ratio:","1.000\n");
			break;
		 
		 case "AMT5" :
			 System.out.println("Transmission Model Number is: "+model);
			System.out.println("Key Specifications:");
			System.out.format("%s %10s","Forward gears are:","5\n");
			System.out.format("%s %10s","1st gear ratio:","2.950\n");
			System.out.format("%s %10s","2nd gear ratio:","1.940\n");
			System.out.format("%s %10s","3rd gear ratio:","1.340\n");
			System.out.format("%s %10s","4th gear ratio:","1.000\n");
			System.out.format("%s %10s","5th gear ratio:","0.630\n");
		 }
	}
		 

}
