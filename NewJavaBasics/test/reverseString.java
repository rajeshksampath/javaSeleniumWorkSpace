
public class reverseString {
	public static boolean isPalindrome(String str1) {
		String reverse = "";
		for (int i = str1.length()-1; i >= 0; i--) {
			reverse = reverse + str1.charAt(i);
		}

		if (str1.equalsIgnoreCase(reverse)) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "123321";
		//String str1 = str.toLowerCase();
		Boolean A = isPalindrome(str1);
		System.out.println(A);

	}

}
