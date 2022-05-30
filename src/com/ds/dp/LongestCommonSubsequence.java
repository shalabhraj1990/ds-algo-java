package com.ds.dp;

import java.util.Hashtable;

public class LongestCommonSubsequence {
	public static String str1 = "abbd";
	public static String str2 = "bcad";
	public static char[] s1 = str1.toCharArray();
	public static char[] s2 = str2.toCharArray();
	private static Hashtable<Tuple2<Integer,Integer>,Integer> dp = new Hashtable<>(); 

	public static void main(String[] args) {
		System.out.println(lcs(s1.length - 1, s2.length - 1));
	}

	private static int lcs(int i, int j) {
		if (i == -1 || j == -1) {
			return 0;
		} else {
			Tuple2<Integer,Integer> key = new Tuple2<Integer,Integer>(i,j);
			if(dp.containsKey(key)) {
				return dp.get(key);
			}
			if (s1[i] == s2[j]) {
				dp.put(key, lcs(i - 1, j - 1) + 1);
				//return lcs(i - 1, j - 1) + 1;
			} else {
				dp.put(key, Math.max(lcs(i - 1, j), lcs(i, j - 1)));
				//return Math.max(lcs(i - 1, j), lcs(i, j - 1));
			}
			return dp.get(key);
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
