package com.ds.stack;

import java.util.Stack;

public class Pattern1BalacedParenthesis {
	public static void main(String[] args) {
		String str = "({[]})";
		System.out.println(checkBalacedString(str));
	}

	public static boolean checkBalacedString(String str) {
		Stack<Character> st = new Stack<>();
		boolean isBalancedStr = true;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
				st.push(str.charAt(i));
			} else {
				if (st.size() == 0) {
					isBalancedStr = false;
					break;
				} else {
					char topOfStack = st.lastElement();
					if (str.charAt(i) == '}' && topOfStack == '{') {
						st.pop();

					} else if (str.charAt(i) == ']' && topOfStack == '[') {
						st.pop();

					} else if (str.charAt(i) == ')' && topOfStack == '(') {
						st.pop();

					} else
						isBalancedStr = false;
				}

			}

		}
		if (isBalancedStr && st.empty())
			return true;
		else
			return false;

	}

}
