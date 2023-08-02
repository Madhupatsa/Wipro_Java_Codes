package com;

class Furniture {
	// declare color, price, discounted price and furniture type as variables
    // use appropriate access specifiers
    public String color;
    public int price;
    private double discountedPrice;
    public FurnitureType furnitureType;
    
    public Furniture(FurnitureType furnitureType,int price,String color) {
    	this.furnitureType = furnitureType;
    	this.color = color;
    	this.price = price;
    }
	
	public double getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(double discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

}
