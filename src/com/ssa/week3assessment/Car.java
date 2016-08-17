package com.ssa.week3assessment;

public class Car extends Vehicle {

		
		String make = null;
		String model = null;
		String color = null;
		boolean seatsAreLeather = false;
		boolean isARaceCar = false;
		
		private static boolean seatsAreLeather(boolean seatsAreLeather){
			return true;
		}
		
		private static boolean isARaceCar(boolean isARaceCar){
			return true;
		}

		public Car(String vehicleType, String vehicleColor, int numberOfSeats, int numberOfDoors, int numberOfTires,
				boolean isNew, String make, String model, String color, boolean seatsAreLeather, boolean isARaceCar) {
			super(vehicleType, vehicleColor, numberOfSeats, numberOfDoors, numberOfTires, isNew);
			this.make = make;
			this.model = model;
			this.color = color;
			this.seatsAreLeather = seatsAreLeather;
			this.isARaceCar = isARaceCar;
		}

		public Car() {
		}

		public String getMake() {
			return make;
		}

		public void setMake(String make) {
			this.make = make;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public boolean isSeatsAreLeather() {
			return seatsAreLeather;
		}

		public void setSeatsAreLeather(boolean seatsAreLeather) {
			this.seatsAreLeather = seatsAreLeather;
		}

		public boolean isARaceCar() {
			return isARaceCar;
		}

		public void setARaceCar(boolean isARaceCar) {
			this.isARaceCar = isARaceCar;
		}
		
		@Override
		public String toString() {
			return "Car [make=" + make + ", model=" + model + ", color=" + color + ", seatsAreLeather="
					+ seatsAreLeather + ", isARaceCar=" + isARaceCar + ", vehicleType=" + vehicleType
					+ ", vehicleColor=" + vehicleColor + ", numberOfSeats=" + numberOfSeats + ", numberOfDoors="
					+ numberOfDoors + ", numberOfTires=" + numberOfTires + ", isNew=" + isNew + "]";
		}
		
}
