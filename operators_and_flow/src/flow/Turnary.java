package flow;

public class Turnary {

	public static void main(String[] args) {
		int age = (int) ((Math.random() * 50) + 10);
		String message = (age < 18) ? "can't drive"
				: (age < 21) ? "army driver" : (age < 24) ? "travel to India" : "ping-pong player";

		System.out.printf("Age: %d, %s", age, message);
	}

}
