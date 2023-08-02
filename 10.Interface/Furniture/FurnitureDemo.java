package com;

import java.util.*;

public class FurnitureDemo {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Hey.. Can you please enter your specification of the furniture that you wants to buy: ");
			String specification = sc.next();
			System.out.println("Now can you please enter your furniture price: ");
			int price = sc.nextInt();
			System.out.println("Now can you please enter the color of your furniture: ");
			String color = sc.next();
			if (specification.equalsIgnoreCase("Bookshelf")) {
				BookShelf obj = new BookShelf(FurnitureType.OFFICE,price,color);
				obj.furnitureDetails();
			}
			else if(specification.equalsIgnoreCase("Sofa")){
				Sofa obj = new Sofa(FurnitureType.HOME,price,color);
				obj.furnitureDetails();
			}
			else if(specification.equalsIgnoreCase("Table")){
				Table obj = new Table(FurnitureType.GARDEN,price,color);
				obj.furnitureDetails();
			}
			else {
				System.out.println("Sorry sir, the type of specification you have entered is not available");
			}
		}

	}

}
