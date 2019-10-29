package runners;

public class Operators {

	public static void main(String[] args) {

		int num1 = (int) (Math.random() * 11);
		int num2 = (int) (Math.random() * 101);

		System.out.printf("The first number is %d, and the second number is %d\n", num1, num2);
		System.out.println("The sum is " + (num1 + num2));

		int average = (num1 + num2) / 2;
		System.out.println("The average is " + average);

		System.out.println("The remainder of the first number is " + (num1 % 10));
		System.out.println("The remainder of the second number is " + (num2 % 10));

		System.out.println("The area of a rectangle is " + (num1 * num2));

	}

}
