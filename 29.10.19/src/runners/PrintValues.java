package runners;

import java.util.Scanner;

public class PrintValues {

	public static void main(String[] args) {
		int num1, num2;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		num1 = in.nextInt();
		System.out.print("Enter the second number: ");
		num2 = in.nextInt();

		in.close();
		System.out.println("The numbers are: " + num1 + ", " + num2);
	}

}
