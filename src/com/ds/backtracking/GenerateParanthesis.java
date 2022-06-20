package com.ds.backtracking;

public class GenerateParanthesis {
	private static String s = "";
	private static int n = 6;

	public static void main(String[] args) {
		f(s, 0, 0);
	}

	private static void f(String s, int opening, int closing) {
		if (s.length() == 2 * n) {
			System.out.println(s);
		} else {
			if (opening < n) {
				f(s + "(", opening + 1, closing);
			}
			if (closing < opening) {
				f(s + ")", opening, closing + 1);
			}
		}
	}
}
