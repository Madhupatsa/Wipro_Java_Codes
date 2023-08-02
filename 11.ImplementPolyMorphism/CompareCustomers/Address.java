package com.jap.oops;

public class Address {
	String area;
	String city;
	Object other;

    public Address(){
        //default constructor
    }

    public Address(String area, String city) {
    	this.area=area;
    	this.city=city;

    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
    	this.area=area;
            }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
    	this.city=city;
    }

    @Override
    public boolean equals(Object other) {

    	return (other.toString().equals(other.toString()));
    }
}
