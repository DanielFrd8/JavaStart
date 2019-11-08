package loop_exercises;

public class BetweenTwoNumbers {

	public static void main(String[] args) {
		int num1 = (int) (Math.random() * 50) + 1;
		int num2 = (int) (Math.random() * 50) + 1;
		int top, floor;

		if (num1 > num2) {
			top = num1;
			floor = num2;
		} else {
			top = num2;
			floor = num1;
		}

		for (int i = floor; i <= top; i++) {
			System.out.println(i);
		}
	}

}
