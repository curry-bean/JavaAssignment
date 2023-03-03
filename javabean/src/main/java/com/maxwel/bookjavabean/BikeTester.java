package com.maxwel.bookjavabean;

/**
 *
 * @author maxwel ochieng
 */
public class BikeTester {

	public static void main(String[] args) {
		// create new instance of the Bike class
		Bike Bike1 = new Bike();	
		// set the properties using setters
		Bike1.setBikeColor("Red");
		Bike1.setBikeModel("Nissan");
		Bike1.setGoodCondition(false);
		Bike1.setMilesPerHour(45.56F);
		Bike1.setNumberOfWheels(4);
		
		// get the properties using get
		System.out.println("Model of the car is: " + Bike1.getBikeModel());
		System.out.println("Color of the car is: " + Bike1.getBikeColor());
        // System.out.println("Number of wheels on car plus 2: " + );
		
		Bike car2 = new Bike("Pajero", "Green", 5, 32.67F, true);
		System.out.println("Bike 2 model: " + car2.getBikeModel());
		
		car2.setBikeModel("Mercedes");
		System.out.println("Bike 2 model: " + car2.getBikeModel());
	}

}
