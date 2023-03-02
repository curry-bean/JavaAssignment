package com.maxwel.bookjavabean;

/**
 *
 * @author maxwel ochieng
 */
public class CarTester {

	public static void main(String[] args) {
		// create new instance of the Car class
		Car Car1 = new Car();	
		// set the properties using setters
		Car1.setCarColor("Red");
		Car1.setCarModel("Nissan");
		Car1.setGoodCondition(false);
		Car1.setMilesPerHour(45.56F);
		Car1.setNumberOfWheels(4);
		
		// get the properties using get
		System.out.println("Model of the car is: " + Car1.getCarModel());
		System.out.println("Color of the car is: " + Car1.getCarColor());
        // System.out.println("Number of wheels on car plus 2: " + );
		
		Car car2 = new Car("Pajero", "Green", 5, 32.67F, true);
		System.out.println("Car 2 model: " + car2.getCarModel());
		
		car2.setCarModel("Mercedes");
		System.out.println("Car 2 model: " + car2.getCarModel());
	}

}
