package com.ds.dp;

import java.util.Hashtable;

public class IntergerBreak {

	private static Hashtable<Integer, Integer> ht = new Hashtable<>();

	public static void main(String[] args) {
		System.out.println(maxProductForIntergerBreak(30));
	}

	public static int maxProductForIntergerBreak(int n) {
		if (n == 1) {
			return 1;
		}

		else {
			if (ht.contains(n)) {
				return ht.get(n);
			} else {
				int ans = 1 * (n - 1);
				int i = 1;
				while (i < n) {
					int firstNum = i;
					int secoundNum = n - i;
					int prod = firstNum * Math.max(secoundNum, maxProductForIntergerBreak(secoundNum));
					if (prod > ans) {
						ans = prod;
					}
					i++;

				}
				ht.put(n, ans);
				return ans;
			}

		}

	}
}
