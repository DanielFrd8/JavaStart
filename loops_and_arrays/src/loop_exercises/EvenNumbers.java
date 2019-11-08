package loop_exercises;

public class EvenNumbers {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 50) + 1;

		for (int i = 0; i <= num; i += 2) {
			System.out.println(i);
		}

	}

}
