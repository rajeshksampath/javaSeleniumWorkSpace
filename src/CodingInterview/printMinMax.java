package CodingInterview;

public class printMinMax {
	/*
	 * 2 5 3 10 12 20 3 13 8
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 2, 5, 3 }, { 10, 12, 20 }, { 3, 13, 8 } };
		int min = a[0][0];
		int column = 0;
		int max = a[0][column];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] < min) {
					min = a[i][j];
					column = j;
				}
			}
		}
		System.out.println(min);
		for (int k = 0; k < 3; k++) {
			if (a[k][column] > max) {
				max = a[k][column];
			}
		}
		System.out.println("Max number is\t" +max);
	}

}
