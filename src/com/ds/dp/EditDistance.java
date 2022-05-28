package com.ds.dp;

import java.util.Hashtable;

public class EditDistance {
	private static String s1 = "kitteng";
	private static String s2 = "sitting";
	private static Hashtable<Tuple2<Integer,Integer>, Integer> dp = new Hashtable<>();

	public static void main(String[] args) {
		int n = s1.length();
		int m = s2.length();
		System.out.println(f(n - 1, m - 1));
	}

	private static int f(int i, int j) {
		if (i == -1) {
			return j + 1;
		} else if (j == -1) {
			return i + 1;
		} else {
			if (dp.containsKey(new Tuple2<Integer, Integer>(i, j))) {
				return dp.get(new Tuple2<Integer, Integer>(i, j));
			} else {
				if (s1.charAt(i) == s2.charAt(j)) {
					// return f(i - 1, j - 1);
					int ans = f(i - 1, j - 1);
					Tuple2<Integer, Integer> key = new Tuple2<Integer, Integer>(i, j);
					dp.put(key, ans);
					return dp.get(key);
				} else {
					int opt_add = 1 + f(i, j - 1);
					int opt_rep = 1 + f(i - 1, j - 1);
					int opt_del = 1 + f(i - 1, j);
					// return Math.min(opt_add, Math.min(opt_rep, opt_del));
					int ans = Math.min(opt_add, Math.min(opt_rep, opt_del));
					Tuple2<Integer, Integer> key = new Tuple2<Integer, Integer>(i, j);
					dp.put(key, ans);
					return dp.get(key);
				}
			}

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
