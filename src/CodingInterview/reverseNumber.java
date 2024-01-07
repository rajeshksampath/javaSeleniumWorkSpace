package CodingInterview;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6534;
		int reverse = 0;
		while (a != 0) {
			int digit = a % 10;
			// 6534 % 10 = 4(remainder); 653 %10 = 3; 65 % 10 = 5; 6%10 =6
			reverse = digit + reverse * 10;
			// 4 + (0*10) = 4; 3+(4*10) = 43; 5 + (43*10) = 435;6+(435*10) = 4356
			a = a / 10;
			// 6534 / 10 = 653; 653/10 = 65; 65/10 = 6; 6/10 = 0.6
		}
		System.out.println(reverse);
	}

}
