package com;

public class Manual extends Transmission{
	
	 Manual(String model) {
		super(model);
	}
	 void showSpec(String model) {
		 System.out.println("Transmission Type is: Manual");
	 switch(model) {
	 case "Mp4": 
		 System.out.println("Transmission Model Number is: "+model);
		System.out.println("Key Specifications:");
		System.out.format("%s %10s","Forward gears are:","4\n");
		System.out.format("%s %10s","1st gear ratio:","2.50\n");
		System.out.format("%s %10s","2nd gear ratio:","1.920\n");
		System.out.format("%s %10s","3rd gear ratio:","1.510\n");
		System.out.format("%s %10s","4th gear ratio:","1.000\n");
		break;
	 
	 case "Mp5" :
		 System.out.println("Transmission Model Number is: "+model);
		System.out.println("Key Specifications:");
		System.out.format("%s %10s","Forward gears are:","5\n");
		System.out.format("%s %10s","1st gear ratio:","3.545\n");
		System.out.format("%s %10s","2nd gear ratio:","1.904\n");
		System.out.format("%s %10s","3rd gear ratio:","1.280\n");
		System.out.format("%s %10s","4th gear ratio:","0.914\n");
		System.out.format("%s %10s","5th gear ratio:","0.757\n");
		break;
	 case "Mp6":
		 System.out.println("Transmission Model Number is: "+model);
		System.out.println("Key Specifications:");
		System.out.format("%s %10s","Forward gears are:","6\n");
		System.out.format("%s %10s","1st gear ratio:","3.010\n");
		System.out.format("%s %10s","2nd gear ratio:","2.070\n");
		System.out.format("%s %10s","3rd gear ratio:","1.430\n");
		System.out.format("%s %10s","4th gear ratio:","1.000\n");
		System.out.format("%s %10s","5th gear ratio:","0.710\n");
		System.out.format("%s %10s","6th gear ratio:","0.570\n");
		break;
	
	 case "MD5":
		 System.out.println("Transmission Model Number is: "+model);
		System.out.println("Key Specifications:");
		System.out.format("%s %10s","Forward gears are:","5\n");
		System.out.format("%s %10s","1st gear ratio:","3.545\n");
		System.out.format("%s %10s","2nd gear ratio:","1.904\n");
		System.out.format("%s %10s","3rd gear ratio:","1.233\n");
		System.out.format("%s %10s","4th gear ratio:","0.911\n");
		System.out.format("%s %10s","5th gear ratio:","0.725\n");
		break;
	 case "MD6":
		 System.out.println("Transmission Model Number is: "+model);
		System.out.println("Key Specifications:");
		System.out.format("%s %10s","Forward gears are:","6\n");
		System.out.format("%s %10s","1st gear ratio:","3.640\n");
		System.out.format("%s %10s","2nd gear ratio:","2.150\n");
		System.out.format("%s %10s","3rd gear ratio:","1.360\n");
		System.out.format("%s %10s","4th gear ratio:","1.000\n");
		System.out.format("%s %10s","5th gear ratio:","0.750\n");
		System.out.format("%s %10s","6th gear ratio:","0.630\n");
	}
	 }
}
