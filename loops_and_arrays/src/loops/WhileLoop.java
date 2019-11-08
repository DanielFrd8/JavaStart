package loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = "";

		System.out.print("Enter a name:");

		while (name.isEmpty()) {
			name = input.nextLine();
		}

		if (name.startsWith("a") && name.endsWith("b")) {
			System.out.printf("Hello %s!\n", name);
		}
		input.close();
	}

}
