package loop_exercises;

public class DivideNum {

	public static void main(String[] args) {
		int max = (int) (Math.random() * 100) + 1;
		int den = (int) (Math.random() * 10) + 1;

		System.out.printf("num: %d, den: %d\n", max, den);
		for (int i = 0; i <= max; i++) {
			if ((i % den) == 0) {
				System.out.println(i);
			}
		}

	}

}
