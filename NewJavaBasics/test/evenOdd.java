
public class evenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 9, 12, 14, 17, 18, 19 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i] + " is odd number");
			} else if (a[i] % 2 == 0) {
				System.out.println(a[i] + " is even number");
			}
		}
	}

}
