package com;



public class Sofa extends Furniture implements IFurniture{

	public Sofa(FurnitureType furnitureType, int price, String color) {
		super(furnitureType, price, color);
		// TODO Auto-generated constructor stub
	}
	final double discountPercentage = 0.05;

	@Override
	public int calculateDiscountedPrice() {
		// TODO Auto-generated method stub
		final int discountedPrice = price-(int) (this.price*discountPercentage);
		return discountedPrice;
		
		
	}

	@Override
	public void furnitureDetails() {
		// TODO Auto-generated method stub
		System.out.println("MRP of Sofa is "+this.price+"rs and after discount the discountedPrice is "+this.calculateDiscountedPrice()+"rs");
	}
}