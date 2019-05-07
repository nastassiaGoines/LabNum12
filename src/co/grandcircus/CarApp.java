package co.grandcircus;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {


	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		Car car1 = (new Car("corvette", "chevy", 2020, 100000));
		carApp2.list.add(car1);
		Car car2 = (new Car("jeep cherokee", "chrysler", 2017, 55000));
		carApp2.list.add(car2);
		Car car3 = (new Car("mustang", "ford", 1958, 78000));
		carApp2.list.add(car3);
		
		System.out.println("Which car would you like?(enter a number): ");
		
		System.out.println(carApp2.list);
		
//		System.out.println("how many cars are you entering? ");
//		
//		int numOfCars = scnr.nextInt();
//		scnr.nextLine();
//		ArrayList<Car> usersCar = new ArrayList<>();
//
//		for (int i = 0; i < numOfCars; i++) {
//			System.out.println("Car #" + (i + 1) + " Make: ");
//			String make = scnr.nextLine();
//			System.out.println("Car #" + (i + 1) + " Model: ");
//			String model = scnr.nextLine();
//			System.out.println("Car #" + (i + 1) + " Year: ");
//			int year = scnr.nextInt();
//			scnr.nextLine();
//			System.out.println("Car #" + (i + 1) + " Price: ");
//			double price = scnr.nextDouble();
//			
//			usersCar.add(new Car(make, model, year, price));
		}
		
		
		
		
//		scnr.close();
		
		

	}


