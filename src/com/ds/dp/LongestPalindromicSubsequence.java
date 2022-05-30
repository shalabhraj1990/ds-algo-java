package com.ds.dp;

import java.util.Hashtable;

public class LongestPalindromicSubsequence {
	private static String str1 = "ABBDCACB";
	private static char[] s1 = str1.toCharArray();
	private static Hashtable<Tuple2<Integer, Integer>, Integer> dp = new Hashtable<>();

	public static void main(String[] args) {
		int i = 0;
		int j = s1.length - 1;
		System.out.println(lps(i, j));
	}

	private static int lps(int i, int j) {
		Tuple2<Integer, Integer> key = new Tuple2<Integer, Integer>(i, j);
		if (i == j) {
			return 1;
		} else if (i < j) {
			if(dp.containsKey(key)) {
				return dp.get(key);
			}
			if (s1[i] == s1[j]) {
				//return lps(i + 1, j - 1) + 2;
				dp.put(key,  lps(i + 1, j - 1) + 2);
			} else {
				//return Math.max(lps(i + 1, j), lps(i, j - 1));
				dp.put(key, Math.max(lps(i + 1, j), lps(i, j - 1)));
			}
			
			return dp.get(key);

		} else {
			return 0;
		}

	}

	private static class Tuple2<T1, T2> {
		T1 t1;
		T2 t2;

		Tuple2(T1 t1, T2 t2) {
			this.t1 = t1;
			this.t2 = t2;

		}
	}
}
