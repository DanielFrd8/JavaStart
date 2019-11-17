package PersonData;

public class PrintPerson {

	public static void main(String[] args) {
		Address address = new Address("Tel Aviv", "Pumpdita", 25);
		Person person = new Person("Avner", 27, address);

		System.out.println(person);
	}

}
