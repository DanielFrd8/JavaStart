package flow;

public class NestedIf {

	public static void main(String[] args) {
		String name = "Avi";
		int age = 21;

		if (age == 18) {
			if (name.equals("Avi")) {
				System.out.println("Avi is 18");
			} else if (name.equals("Avner")) {
				System.out.println("Avner is 18");
			}
		} else if (name.startsWith("A")) {
			System.out.println("The name starts with A");
		}
	}

}
