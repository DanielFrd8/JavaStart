package flow;

public class SwitchStatement {
	public static void main(String[] args) {
		int age = (int) ((Math.random() * 50) + 10);
		String message;

		switch (age) {
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
			message = "can't drive";
			break;
		case 18:
		case 19:
		case 20:
			message = "army driver";
			break;
		case 21:
		case 22:
		case 23:
			message = "travel to India";
			break;
		default:
			message = "ping-pong player";
			break;
		}
		System.out.printf("Age: %d, %s", age, message);
	}

}
