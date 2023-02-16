package Task1;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		String[] inputStrings = new String[3];
		Scanner input = new Scanner(System.in);

		System.out.println("Input text:");
		inputStrings[0]=input.nextLine();
		inputStrings[1]=input.nextLine();
		inputStrings[2]=input.nextLine();
		
		System.out.println("Output text:\n"
				+inputStrings[0]+"\n"
				+inputStrings[1]+"\n"
				+inputStrings[2]+"\n");
	}

}
