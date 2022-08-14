package com.ds.hundred;

public class Day26LongestCommonSubsequence {
	private static String t1 = "abcde";
	private static String t2 = "ace";
	private static int[][] dp = new int[t1.length()][t2.length()];

	public static void main(String[] args) {
		System.out.println(lcf(t1.length()-1, t2.length()-1));
	}

	public static int lcf(int i, int j) {
		if (i == -1 || j == -1) {
			return 0;
		}

		else {
			if (dp[i][j] != 0) {
				return dp[i][j];
			}
			if (t1.charAt(i) == t2.charAt(j)) {
				dp[i][j] = lcf(i - 1, j - 1) + 1;
			} else {
				dp[i][j] = Math.max(lcf(i - 1, j), lcf(i, j - 1));
			}
		}
		return dp[i][j];

	}
}
