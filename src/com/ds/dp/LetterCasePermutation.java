package com.ds.dp;

public class LetterCasePermutation {
	private static String s = "a1b2";
	private static char[] s1 = s.toCharArray();

	public static void main(String[] args) {
		f(0);
	}

	private static void f(int i) {
		if (i == s1.length) {
			System.out.println(s1);
		}
		else {
			if((s1[i] >= 'a' && s1[i] <= 'z') ||(s1[i] >= 'A' && s1[i] <= 'Z')) {
				//#2 choices --1st leave as it is
				f(i+1);
				//2nd toggle char
				toggleCase(s1,i);
				f(i+1);
				//again revese back to original string
				toggleCase(s1,i);
			}
			else {
				f(i+1);
			}
		}
		
	}

	// helper
	private static void toggleCase(char[] s, int i) {
		if (s[i] >= 'a' && s[i] <= 'z') {
			s[i] = (char) ((int) s[i] - 32);
		} else {
			s[i] = (char) ((int) s[i] + 32);
		}
	}
}
