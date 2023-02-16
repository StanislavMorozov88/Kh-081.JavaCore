package Task3;
import java.util.Scanner;

public class Taks3 {

	public static void main(String[] args) {
		/*
		 * Phone calls from three different countries cost c1, c2 and c3 conventional
		 * units per minute. Talks lasted t1, t2 and t3 minutes. What is the cost of
		 * each call? What is the total cost? Input all source data from console, make
		 * calculations and output to the console
		 */
		
		float[] cost = new float[3];
		float[] time = new float[3];
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello, enter below price of calls (in c.u.) from different countries \n"
				+ "and their duration (in minutes): ");
		
		System.out.print("Price fom Italy: ");
		cost[0]=input.nextFloat();
		System.out.print("Duration: ");
		time[0]=input.nextFloat();
		
		System.out.print("Price fom Japan: ");
		cost[1]=input.nextFloat();
		System.out.print("Duration: ");
		time[1]=input.nextFloat();
		
		System.out.print("Price fom UK: ");
		cost[2]=input.nextFloat();
		System.out.print("Duration: ");
		time[2]=input.nextFloat();
		
		System.out.println("You have to pay a bill of: \n"
				+ time[0]*cost[0] + " c.u. for a call from Italy,\n"
				+ time[1]*cost[1] + " c.u. for a call from Japan,\n"
				+ time[2]*cost[2] + " c.u. for a call from the UK.");

	}

}
