package com.niit.courier;

import java.time.LocalDateTime;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Courier {
   //Declare appropriate variables
	private int courierOrderId;
	private CourierType courierType;
	private Address sender;
	private Address receiver;
	private float shipmentWeight;
	private String shipmentDimensions;
	private PaymentMode paymentMode;
	private Date courierReceiptDateTime;
	private double costOfCourier;
	int a;
    // Provide appropriate getters and setters


    // Parameterized constructor
    public Courier(int courierOrderId, CourierType courierType, Address sender, Address receiver, float shipmentWeight,
                   String shipmentDimensions, PaymentMode paymentMode, Date courierReceiptDateTime) {
    	this.courierOrderId=courierOrderId;
    	this.courierType=courierType;
    	this.sender=sender;
    	this.receiver=receiver;
    	this.shipmentWeight=shipmentWeight;
    	this.shipmentDimensions=shipmentDimensions;
    	this.paymentMode=paymentMode;
    	this.courierReceiptDateTime=courierReceiptDateTime;
    	
    	
        //Initialize values

    }
    //  final String to hold the courier charges from source city to destination city
    // do not change the values
    private final String charges[] = { "Chennai,Coimbatore,50", "Chennai,Trichy,50", "Chennai,Bangalore,100" };

    // calculate the cost of the courier depending on the weight and extract the cost from charges array
    // the calculateCost() method cannot be accessed outside the class, provide appropriate access specifiers
     public double calculateCost() {
        //double costOfCourier;
        	if (receiver.getCity().equals("Coimbatore") || receiver.getCity().equals("Trichy")) {
        		a=50;
        		this.costOfCourier=this.shipmentWeight*a;
        	}
        	else if(receiver.getCity().equals("Bangalore")) {
        		a=100;
        		this.costOfCourier=this.shipmentWeight*a;
        	}
        	else
        		this.costOfCourier=-1;
        return costOfCourier;
    }
    // generate a random number between 100000 and 900000 to be sent back as acknowledgement,
    // provide appropriate access specifiers since this method will not be used outside this class
    public int generateAcknowledgementNumber()
    {
    	//Random random=new Random();
 	   //int k=randomobj.nextInt(1000000);
 	   //System.out.println(k);
        return (int)(Math.random()*(900000-100000+1)+100000);
    }

    // return the acknowledgement number, if cost is = 0, then return a message 'no services to the area'
    public String acknowledgementGenerator() {
       if (this.calculateCost()>0) {
    	   return "Ack"+this.generateAcknowledgementNumber();
       }
    return "no services to the area";
    }

    // Display the details of the courier, cost of dispatch and acknowledgement number
    //
    public void displayCourierDetails() {
    	System.out.println("Courier [charges="+this.a+" ,cost="+this.costOfCourier+" ,courierOrderId="+this.courierOrderId+
    			" ,courierReceiptDateTime="+this.courierReceiptDateTime+" ,courierType="+this.courierType+" ,paymentMode="+paymentMode+
    			" ,receiver"+this.receiver+" ,sender="+this.sender+" ,shipmentDimensions="+this.shipmentDimensions+" ,shipmentWeight="+
    			this.shipmentWeight);
    	
    }

    // Display courier details in desired format as below
//    Courier [charges=xxx, cost=xxx, courierOrderId=xxx, courierReceiptDateTime=xxx, courierType=xxx
//                ,paymentMode=xxx, receiver=xxx, sender=xxx,
//               shipmentDimensions=xxxx, shipmentWeight=xxx]

//   @Override
//    public String toString() {
//	   Address obj=new Address();
//	   return "";
//    }
}
