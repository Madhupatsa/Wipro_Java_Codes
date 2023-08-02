package com.niit.courier;

import java.time.LocalDateTime;
import java.util.Date;

public class CourierImpl {
    public static void main(String[] args) {
        // Declare and Initialize Address and courier objects to test your code
        // give desired values
        // call the displayCourierDetails() method to display the details of the courier
    	Courier courier = new Courier(101, CourierType.DOMESTIC,
                new Address("Gary",23,"Marble drive","Chennai","+917999733452"),
                new Address("Sam",23,"Marble drive","Coimbatore","+917999733452"),
                200,"10X10", PaymentMode.CASH, new Date());
    	Courier courier1 = new Courier(101, CourierType.DOMESTIC,
                new Address("Gary",23,"Marble drive","Chennai","+917999733452"),
                new Address("Sam",23,"Marble drive","Hyderabad","+917999733452"),
                100,"10X10", PaymentMode.CASH, new Date());
    	System.out.println(courier.calculateCost());
    	System.out.println(courier.acknowledgementGenerator());
    	System.out.println(courier1.calculateCost());
    	System.out.println(courier1.acknowledgementGenerator());
    	courier.displayCourierDetails();
    	courier1.displayCourierDetails();
}
}
    
