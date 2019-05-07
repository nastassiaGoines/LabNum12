package co.grandcircus;

public class Car {
//instance variables
//data members	
	private String make;
	private String model;
	private int year;
	private double price;
	
	
	
	public Car() {//no-argument constructor
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String make, String model, int year, double price) {//constructor w/ 4 arguments matching above
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public String getMake() {//getters and setters
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "\n";
	}

//	@Override
//	public String toString() {//to string method
//		return String.format("Name: %-30s Age: %-10s Gender: %-10s", "Car make= " + make + ", model=" + model + ", year=" + year + ", price = " + price + "n/");
//		}
	
	
	
	
}
