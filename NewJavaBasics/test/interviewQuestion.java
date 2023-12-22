
public class interviewQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2 4 10 
		 * 3 2 7 
		 * 1 2 0
		 */
		
		int a[][] = { { 2, 4, 10 }, { 3, 2, 7 }, { 1, 2, 0 } };
		int min = a[0][0];
		int mincolumn = 0;
		int max = a[0][mincolumn];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				if (a[i][j] < min) {
					min = a[i][j];
					mincolumn = j;
				}
			}
		}

			for (int k = 0; k < 3; k++) {
				if (a[k][mincolumn] > max) {
					max = a[k][mincolumn];
				}
			}

			System.out.println("minimun number is " + min);
			System.out.println("maximum number is " + max);
		}

	}

