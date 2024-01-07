package CodingInterview;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "john";
		boolean a = isPalindrome(s);
		System.out.println(a);

		if (a) {
			System.out.println(s);
			System.out.println("String " + s + " is palindrome");
		} else {
			System.out.println(s);
			System.out.println("String " + s + "\tis not palindrome");
		}
	}

	public static boolean isPalindrome(String str) {

		String t = "";
		//boolean ans = false;
		for (int i = str.length() - 1; i >= 0; i--) {
			t = t + str.charAt(i);
			
		}
		//System.out.println(t);
		if (t.equals(str)) {
			//ans= true;
			return true;
		}
		return false;
	}

}
