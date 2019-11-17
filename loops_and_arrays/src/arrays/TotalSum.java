package arrays;

import java.util.Arrays;

public class TotalSum {

	public static void main(String[] args) {
		int[] intArray = new int[10];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int) (Math.random() * 100);
		}

		int sum = 0;
		for (int val : intArray) {
			sum += val;
		}

		int average = sum / intArray.length;
		System.out.println(Arrays.toString(intArray));
		System.out.printf("The sum: %d\nThe average: %d", sum, average);
	}

}
