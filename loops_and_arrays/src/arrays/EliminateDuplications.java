package arrays;

import java.util.Arrays;

public class EliminateDuplications {

	public static void main(String[] args) {
		int[] intArray = new int[10];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int) (Math.random() * 10) + 1;
		}
		System.out.println(Arrays.toString(intArray));

		int[] tempArray = new int[10];
		int counter = 0;

		for (int i = 0; i < intArray.length; i++) {
			int currentVal = intArray[i];
			boolean isExist = false;
			int index = 0;
			while (!isExist && index < tempArray.length) {
				if (intArray[i] == tempArray[index]) {
					isExist = true;
				}
				index++;
			}
			if (!isExist) {
				tempArray[counter] = currentVal;
				counter++;
			}
		}
		System.out.println(Arrays.toString(tempArray));

		int[] uniqueArray = new int[counter];
		for (int i = 0; i < uniqueArray.length; i++) {
			uniqueArray[i] = tempArray[i];
		}

		System.out.println(Arrays.toString(uniqueArray));
	}
}
