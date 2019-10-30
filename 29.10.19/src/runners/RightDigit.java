package runners;

import java.util.Scanner;

public class RightDigit {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		int rightDigit;

		System.out.print("Enter a number of 4 digits: ");
		num = in.nextInt();
		in.close();

		rightDigit = num % 10;
		System.out.println("The right digit is: " + rightDigit);
	}

}
