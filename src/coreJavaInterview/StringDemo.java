package coreJavaInterview;

public class StringDemo {
	public static void main(String args[]) {

		String a = "hello"; // String Literal
		String b = "hello"; // New memory will not be allocated. b reference variable will point to object
							// a.
		System.out.println(a.equals(b)); /// true - Blindly compare the content.
		System.out.println(a == b); // true - equals operator will be true if the object reference is same.

		a.concat("World");
		String c = a.concat("World");
		System.out.println(a);
		System.out.println(c);
		String s = new String("hello"); // new memory will be allocated and create object
		String s1 = new String("hello");// new memory will be allocated and create object
		System.out.println(a.equals(s));// true -> content compare
		System.out.println(a == s); // false - Memory is different and object reference for a and s are different, since s is defined using string class instead of literal.
		/*
		 * Why Strings are immutable ? We cannot alter original content. IN above
		 * scenario when we print a, it will still be "hello" and not "hello World", so
		 * we cannot alter the original content. if it alters then b will also refer to
		 * "hello World" which would be incorrect. This is the reason strings are
		 * immutable.
		 */

// String buffer or String builder class is used to mute.
		StringBuffer sb = new StringBuffer("<hello>");
		sb.replace(0, 7, "hello");
		System.out.println(sb);
		sb.append("World");
		System.out.println(sb);
		// String buffer is mutable and it will print "hello world"
		sb.insert(2, "she");
		System.out.println(sb);
		sb.replace(1, 7, "a");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
// StringBuffer -> Is thread safe and Synchronized because of which its little slow.
		// String Builder -> nIs not thread safe & not synchronized and fast.

	}
}
