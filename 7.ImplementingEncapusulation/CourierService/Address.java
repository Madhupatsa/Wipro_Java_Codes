package com.niit.courier;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Address {
    // Declare the attributes that correspond to Address
	String name; int houseNo;
	String street; String city; String phoneNo;
	
	@Override
    public String toString() {
	   //Address obj=new Address();
	   return "Address [city="+this.city+", houseNo="+this.houseNo+", name="+this.name+", phoneNo="+this.phoneNo+", street="+this.street+"]" ;
    }
    // This methods takes a phone no as a string and validates the phone number
    // The phone no must be in the format below
    //  +<area code><10 digit numbers> - +919776855678
    // or a 10 digit number - 9776855678

    public static int isPhoneNoValid(String phone)
    {
        Pattern ptrn = Pattern.compile("((\\+*)((0[ -]*)*|((91)*))((\\d{12})+|(\\d{10})+))|\\d{5}([- ]*)\\d{6}");
        Matcher match =ptrn.matcher(phone);
        if(match.find() && match.group().equals(phone))
        	return 1;
        else
        	return 0;
    }

    // Setter and getter methods

    public String getName() {
        return name;
    }
    public int getHouseNo() {
        return houseNo;
    }
    public String getStreet() {
        return street;
    }
    public String getCity() {
        return city;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    // setPhoneNo in the class, the phone number cannot be modified outside the class
    static  String setPhoneNo(String phoneNo) {
    	if (isPhoneNoValid(phoneNo)==1) {
    		//this.phoneNo=phoneNo;
    		return ("Give a valid phone number");
    	}
    	else {
    		//this.phoneNo="-1";
    		return("Give an valid phone number");
    	}
    }

    // The method must return the address in the below format
   // Address [city=xxx,houseNo=xxx,name=xxx,phoneNo=xxx,street=xxx]


    // Parameterized constructor
    public Address(String name, int houseNo, String street, String city, String phoneNo) {
    	
        // Initialize values here
    	this.name=name;
    	this.houseNo=houseNo;
    	this.street=street;
    	this.city=city;
    	this.phoneNo=phoneNo;
    }

    
}
