package Task2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
//		Define String variables name and address. Output question "What is your name?"
//		Read the value name and output next question: “Where are you live, (name)?". Read
//		address and write whole information 
		
		String name;
		String address;
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name?");
		name = input.nextLine();
		System.out.println("Where are you live, " + name);
		address = input.nextLine();
		System.out.println("Nice to meet you, " + name + " from " + address);
	}

}
