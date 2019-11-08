package operators;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = input.nextLine();

		System.out.print("Enter your age: ");
		int age = input.nextInt();

		System.out.print("Enter, are you cool: ");
		boolean isCool = input.nextBoolean();

		System.out.println("Hi " + name + ", your age is " + age + ", and are you cool? :" + isCool);
		System.out.printf("Hi %s, your age is %d, and are you cool? :%b", name, age, isCool);
		input.close();
	}

}
