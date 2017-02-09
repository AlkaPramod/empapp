package com.google.empapp.model;

public class EMPLOYEE {
	private Integer ID;
	private String NAME;
	private String DESIGNATION;
	public Integer getID() {
		return ID;
	}
	
	
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getDESIGNATION() {
		return DESIGNATION;
	}
	public void setDESIGNATION(String dESIGNATION) {
		DESIGNATION = dESIGNATION;

	
}


	@Override
	public String toString() {
		return "EMPLOYEE [ID=" + ID + ", NAME=" + NAME + ", DESIGNATION=" + DESIGNATION + "]";
	}
	}