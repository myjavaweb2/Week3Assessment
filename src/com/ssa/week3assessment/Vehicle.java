package com.ssa.week3assessment;

public class Vehicle {
	
	String vehicleType = null;
	String vehicleColor = null;
	int numberOfSeats = 0;
	int numberOfDoors = 0;
	int numberOfTires = 0;
	boolean isNew = false;
	

	public Vehicle(String vehicleType, String vehicleColor, int numberOfSeats, int numberOfDoors, int numberOfTires,
			boolean isNew) {
		this.vehicleType = vehicleType;
		this.vehicleColor = vehicleColor;
		this.numberOfSeats = numberOfSeats;
		this.numberOfDoors = numberOfDoors;
		this.numberOfTires = numberOfTires;
		this.isNew = isNew;
	}
	
	public Vehicle() {
	}

	public static void vehicleStarts(){
		return;
	}

	public static void vehicleMoves(){
		return;
	}
	
	public static boolean fuelIsFull(){
		return true;
	}
	
	public static void vehicleStops(){
		return;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleColor() {
		return vehicleColor;
	}

	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public int getNumberOfTires() {
		return numberOfTires;
	}

	public void setNumberOfTires(int numberOfTires) {
		this.numberOfTires = numberOfTires;
	}

	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

}
