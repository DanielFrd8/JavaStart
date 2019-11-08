package flow;

public class IfStatement {

	public static void main(String[] args) {
		int rand = (int) (Math.random() * 10) + 1;

		if (rand < +5) {
			System.out.printf("The random number %d is lesser or equals to 5", rand);
		} else {
			System.out.printf("The random number %d is greater than 5", rand);
		}
	}
}
