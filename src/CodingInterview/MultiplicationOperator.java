package CodingInterview;

public class MultiplicationOperator {
	// Print 5 Multiplication table without multiply operator
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = multiply(5, 10);
	}

	public static int multiply(int i, int j) {
		// TODO Auto-generated method stub
		int k;
		int sum = 0;
		for (k = 1; k <= j; k++) {
			sum = sum + i;
			System.out.println(sum);
		}
		return sum;
	}

}
