package com;

public class Automatic extends Transmission {
	Automatic(String model){
		super(model);
	}
	 void showSpec(String model) {
		 System.out.println("Transmission Type is : Automatic");
		 switch(model) {
		 case "CVT6":
			 System.out.println("Transmission Model Number is: "+model);
			System.out.println("Key Specifications:");
			System.out.format("%s %10s","Forward gears are:","6\n");
			System.out.format("%s %10s","1st gear ratio:","2.631\n");
			System.out.format("%s %10s","2nd gear ratio:","1.440\n");
			System.out.format("%s %10s","3rd gear ratio:","1.165\n");
			System.out.format("%s %10s","4th gear ratio:","0.906\n");
			System.out.format("%s %10s","5th gear ratio:","0.680\n");
			System.out.format("%s %10s","6th gear ratio:","0.499\n");
			break;
		 case "DVT8":
			 System.out.println("Transmission Model Number is: "+model);
				System.out.println("Key Specifications:");
				System.out.format("%s %10s","Forward gears are:","8\n");
				System.out.format("%s %10s","1st gear ratio:","4.714\n");
				System.out.format("%s %10s","2nd gear ratio:","3.143\n");
				System.out.format("%s %10s","3rd gear ratio:","2.106\n");
				System.out.format("%s %10s","4th gear ratio:","1.617\n");
				System.out.format("%s %10s","5th gear ratio:","1.285\n");
				System.out.format("%s %10s","6th gear ratio:","1.000\n");
				System.out.format("%s %10s","7th gear ratio:","0.839\n");
				System.out.format("%s %10s","8th gear ratio:","0.677\n");
			 }
		 }
}
