package com.maxwel.bookjavabean;

/**
 *
 * @author maxwel
 * 
 */

import java.io.Serializable;

public class Bike implements Serializable  {
	private static final long serialVersionUID = 1L;
	
	// encapsulated properties/ variables
	private String bikeModel;
	private String bikeColor;
	private Integer numberOfWheels;
	private Float milesPerHour;
	private Boolean goodCondition;
	
	// default constructor- no arg-constructor
	public Bike() {  }

	// getters and setters
	public String getBikeModel() {
		return bikeModel;
	}
	
	// overriding the constructor
	public Bike(String bikeModel, String bikeColor, Integer numberOfWheels, Float milesPerHour, Boolean goodCondition) {
		super();
		this.bikeModel = bikeModel;
		this.bikeColor = bikeColor;
		this.numberOfWheels = numberOfWheels;
		this.milesPerHour = milesPerHour;
		this.goodCondition = goodCondition;
	}

	public void setBikeModel(String bikeModel) {
		this.bikeModel = bikeModel;
	}

	public String getBikeColor() {
		return bikeColor;
	}

	public void setBikeColor(String bikeColor) {
		this.bikeColor = bikeColor;
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
