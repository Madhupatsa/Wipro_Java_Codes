package com;



public class BookShelf extends Furniture implements IFurniture{

	public BookShelf(FurnitureType furnitureType, int price, String color) {
		super(furnitureType, price, color);
		// TODO Auto-generated constructor stub
	}
	final double discountPercentage = 0.1;

	@Override
	public int calculateDiscountedPrice() {
		// TODO Auto-generated method stub
		final int discountedPrice = price-(int) (this.price*discountPercentage);
		return discountedPrice;
		
		
	}

	@Override
	public void furnitureDetails() {
		// TODO Auto-generated method stub
		System.out.println("MRP of bookshelf is "+this.price+"rs and after discount the discountedPrice is "+this.calculateDiscountedPrice()+"rs");
	}

	
	
	// specify attributes for BookShelf
    // define constructors, ensure the super keyword is used
	
	
}
