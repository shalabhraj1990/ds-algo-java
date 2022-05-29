package com.ds.dp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

public class LongestIncreasingSubsequence {
	static final int[] a = { 2, 3, 1, 5, 6, 4, 8 };
	static final int n = a.length;
	static int length = 1;
	static Hashtable<Integer, Integer> dp = new Hashtable<>();

	public static void main(String[] args) {
		List<Integer> ans = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			ans.add(lis(i));
		}
		System.out.println(Collections.max(ans));
		// lis(6);
		// System.out.println(lis(6));
		// System.out.println(length);
	}

	private static int lis(int i) {

		System.out.println("lis for :" + i);

		if (i == 0) {
			return 1;
		} else {
			if (dp.containsKey(i)) {
				return dp.get(i);
			}
			int ans = 1;
			for (int j = 0; j < i; j++) {
				if (a[j] < a[i]) {
					int newAns = lis(j) + 1;
					if (newAns > ans) {
						ans = newAns;
					}
				}
			}
//			if (ans > length) {
//				length = ans;
//			}
			dp.put(i, ans);
			return ans;
		}

	}

}
