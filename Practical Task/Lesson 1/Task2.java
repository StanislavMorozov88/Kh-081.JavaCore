package Task2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		float[] inputStrings = new float[3];
		Scanner input = new Scanner(System.in);

		System.out.println("Input first number:");
		inputStrings[0]=input.nextFloat();
		System.out.println("Input second number:");
		inputStrings[1]=input.nextFloat();
		System.out.println("Input third number:");
		inputStrings[2]=input.nextFloat();
		
		System.out.println("Average is " + (inputStrings[0]+inputStrings[1]+inputStrings[2])/3.0f );

	}

}
