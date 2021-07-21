package com.natwest.singleresponsibility;

public class Driver {
	
	private int mileage;
	private int licenseNo;
	
	public Driver() {
		super();
	}

	public Driver(int mileage, String name, int licenseNo) {
	super();
	this.mileage = mileage;
	this.licenseNo = licenseNo;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

		public int getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(int licenseNo) {
		this.licenseNo = licenseNo;
	}

	@Override
	public String toString() {
		return "Driver [mileage=" + mileage + ", licenseNo=" + licenseNo + "]";
	}
		
	
	
	}
