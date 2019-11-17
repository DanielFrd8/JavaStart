package AnimalData;

public class Animal {

	public String type;
	public int legsAmount;
	public String color;

	public Animal(String type, int legsAmount, String color) {
		this.type = type;
		this.legsAmount = legsAmount;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Animal [type=" + type + ", legsAmount=" + legsAmount + ", color=" + color + "]";
	}
}
