package flow;

public class AgeStatement {

	public static void main(String[] args) {
		int age = (int) ((Math.random() * 50) + 10);

		if (age < 18) {
			System.out.printf("Age: %d, can't drive", age);
		} else if (age < 21) {
			System.out.printf("Age: %d, army driver", age);
		} else if (age < 24) {
			System.out.printf("Age: %d, travel to India", age);
		} else {
			System.out.printf("Age: %d, ping-pong player!", age);
		}
	}

}
