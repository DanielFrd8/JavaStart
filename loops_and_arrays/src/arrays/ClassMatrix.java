package arrays;

public class ClassMatrix {

	public static void main(String[] args) {
		int students = 20;
		int grades = 10;
		int[][] classMatrix = new int[students][grades];

		int totalSum = 0;

		for (int i = 0; i < classMatrix.length; i++) {
			for (int j = 0; j < classMatrix[i].length; j++) {
				classMatrix[i][j] = (int) (Math.random() * 101);
			}
		}

		for (int i = 0; i < classMatrix.length; i++) {
			int sum = 0;
			int[] student = classMatrix[i];

			for (int grade : student) {
				sum += grade;
			}

			int average = sum / classMatrix[i].length;
			System.out.printf("student number %d recieved average of %d\n", (i + 1), average);
			totalSum += average;
		}

		int totalAverage = totalSum / students;
		System.out.printf("the average of the class is %d", totalAverage);
	}

}
