package CodingInterview;

public class charinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = compareChar("aaaddaaha", 'a');
		System.out.println(count);
	}

	private static int compareChar(String word, char c) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == c) {
				count++;
			}
		}

		return count;
	}

}
