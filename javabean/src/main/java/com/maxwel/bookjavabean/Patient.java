package com.maxwel.bookjavabean;

import java.io.Serializable;

/**
 *
 * @author aloha-tech
 */

public class Patient implements Serializable {
	private static final long serialVersionUID = 1L;
	
	// encapulated class properties(use 'private' keyword)
	private String patientid;
	private String firstName;
        private String LastName;
	private String unitsex;
	private Integer unitBP;
	private String Bpunit; 
	
	// getters help retrieve details for the object
	public String getPatientid() {
		return patientid;
	}
	public void setPatientId(String patientid) {
		this.patientid = patientid;
	}
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
        public String getLastName() {
		return LastName;
	}
	public void setLastName(String LastName) {
		this.LastName = LastName;
	}
	public String getunitsex() {
		return unitsex;
	}
	public void setUnitSex(String unitsex) {
		this.unitsex = unitsex;
	}
	public Integer getBpunit() {
		return unitBP;
	}
	public String getBPUnit() {
		return Bpunit;
	}
	public void setBPUnit(String Bpunit) {
		this.Bpunit= Bpunit;
	}
	
	// setters help 'set' properties of the object
	public void setBpunit(Integer unitBP) {
		this.unitBP = unitBP;
	}

	// the default constructor takes no arguments
	public Patient() {}
}
