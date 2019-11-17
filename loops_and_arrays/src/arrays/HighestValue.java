package arrays;

import java.util.Arrays;

public class HighestValue {

	public static void main(String[] args) {
		int[] intArray = new int[50];
		int highestValue = 0;
		int index = 0;

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int) (Math.random() * 100);
			if (intArray[i] > highestValue) {
				highestValue = intArray[i];
				index = i;
			}
		}

		int counter = 0;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[counter] > highestValue) {
				highestValue = intArray[i];
				index = counter;
			}
			i++;
		}

		System.out.println(Arrays.toString(intArray));
		System.out.printf("The highest: %d\nThe index: %d", highestValue, index);
	}

}
