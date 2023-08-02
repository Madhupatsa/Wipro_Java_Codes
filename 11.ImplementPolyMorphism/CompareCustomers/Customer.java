package com.jap.oops;

public class Customer {
	Address address;
	int customerId;
	String name;
	String email;

    public Customer() {
        //default Constructor
    }

    public Customer(int customerId, String name, String email, Address address) {
    	this.customerId=customerId;
    	this.name=name;
    	this.email=email;
    	this.address=address;

    }



    @Override
    public boolean equals(Object other) {

        return other.toString().equals(other.toString());
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
    	this.customerId=customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
    	this.name=name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
    	this.email=email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
    	this.address=address;

    }
}
