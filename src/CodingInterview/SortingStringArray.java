package CodingInterview;

public class SortingStringArray {
    public static void main(String[] args) {
        String[] a = {"2.1.3", "2.1.4", "5.3.2"};

        // Sort the array in descending order
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].compareTo(a[j]) > 0) {
                    String temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted array:");
        for (String element : a) {
            System.out.println(element);
        }
    }
}