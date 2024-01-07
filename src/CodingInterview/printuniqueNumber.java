package CodingInterview;

import java.util.ArrayList;

public class printuniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// {2,2,3,4,4,3,3,5,5,9}
		// O/p = 2 - 2, 3 - 3, 4 - 2, 5 - 2, 9 -1

		int a[] = { 2, 2, 3, 4, 4, 3, 3, 5, 5, 9 };
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			if (!list.contains(a[i])) {
				list.add(a[i]);
				count++;

				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						count++;
					}
				}
				System.out.println(a[i] + "\t" + count);
			}

		}

	}
}
