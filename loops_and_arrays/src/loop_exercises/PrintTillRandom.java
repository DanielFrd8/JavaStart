package loop_exercises;

public class PrintTillRandom {

	public static void main(String[] args) {

		int num = (int) (Math.random() * 50) + 1;

		for (int i = 0; i <= num; i++) {
			System.out.println(i);
		}

	}

}
