package Homework._1;


import java.lang.Math;
import java.util.Scanner;

public class Task1 {
	
	//I didn't like that there were too many digits after the comma so create than method...
	public static double roundDouble(double number, int digits) {
		double roundedNumber;
		roundedNumber = Math.round(number * Math.pow(10, digits))/Math.pow(10, digits)*1.0d;
		
		return roundedNumber;
	}
	
	public static void main(String[] args) {
			//	Flower bed is shaped like a circle. Calculate the perimeter and area by entering the
			//	radius in console. Output obtained results 
		
		System.out.println("Hello! \nPlease, enter radius of flower bed:");
		
		double radius;
		Scanner sc = new Scanner(System.in);
		radius = sc.nextFloat();
		
		double perimeter = 2 * Math.PI * radius;
		double area = Math.PI * Math.pow(radius, 2);
		
		System.out.println("Perimeter of flower bed is " + roundDouble(perimeter, 2) 
		+ "\nand area is " + roundDouble(area, 2));
		sc.close();
	}

}
