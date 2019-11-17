package arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] intArray = new int[10];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int) (Math.random() * 10) + 1;
		}

		int[] reverseArray = new int[intArray.length];

		for (int i = 0; i < intArray.length; i++) {
			reverseArray[intArray.length - (i + 1)] = intArray[i];
		}

		System.out.println(Arrays.toString(intArray));
		System.out.println(Arrays.toString(reverseArray));
	}

}
