import java.util.*;
import java.io.*;

class Test {

	public static String SearchingChallenge(String str) {
		Stack<Character> st = new Stack<>();
		int n = str.length();
		for (int i = 0; i < n - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {

			}
			else {
				st.push(str.charAt(i));
			}
		}
		return str;
	}
	
	public static void checkForPalindrome(Stack<Character> st,String str,int index) {
		
	}

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		System.out.print(SearchingChallenge(s.nextLine()));
	}

}