package com.maxwel.bookjavabean;

/**
 *
 * @author aloha-tech
 */

import java.io.Serializable;

public class Car implements Serializable  {
	private static final long serialVersionUID = 1L;
	
	// encapsulated properties/ variables
	private String carModel;
	private String carColor;
	private Integer numberOfWheels;
	private Float milesPerHour;
	private Boolean goodCondition;
	
	// default constructor- no arg-constructor
	public Car() {  }

	// getters and setters
	public String getCarModel() {
		return carModel;
	}
	
	// overriding the constructor
	public Car(String carModel, String carColor, Integer numberOfWheels, Float milesPerHour, Boolean goodCondition) {
		super();
		this.carModel = carModel;
		this.carColor = carColor;
		this.numberOfWheels = numberOfWheels;
		this.milesPerHour = milesPerHour;
		this.goodCondition = goodCondition;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public Integer getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(Integer numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public Float getMilesPerHour() {
		return milesPerHour;
	}

	public void setMilesPerHour(Float milesPerHour) {
		this.milesPerHour = milesPerHour;
	}

	public Boolean getGoodCondition() {
		return goodCondition;
	}

	public void setGoodCondition(Boolean goodCondition) {
		this.goodCondition = goodCondition;
	} 
}
