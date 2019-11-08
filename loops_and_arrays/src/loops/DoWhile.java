package loops;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = "";

		System.out.print("Enter a name:");

		do {
			name = input.nextLine();
		} while (name.isEmpty());

		if (name.startsWith("a") && name.endsWith("b")) {
			System.out.printf("Hello %s!\n", name);
		}
		input.close();
	}

}
