package runners;

import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1, num2, num3;
		int sum, average;

		System.out.print("Enter the first number: ");
		num1 = in.nextInt();
		System.out.print("Enter the second number: ");
		num2 = in.nextInt();
		System.out.print("Enter the third number: ");
		num3 = in.nextInt();
		
		in.close();
	
		sum = num1 + num2 + num3;
		average = sum / 3;
		System.out.printf("The sum is: %d, and the average is: %d", sum, average);
	}	
}
