package com.ds.backtracking;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Permutation {
	static Map<Integer, Boolean> ht;
	static int n = 2;

	public static void main(String[] args) {

		int[] arr = new int[n];
		ht = new HashMap<>();
		backTracking(0, arr, ht);
	}

	private static void backTracking(int i, int[] a, Map<Integer, Boolean> used) {
		if (i == n) {

			for (int j = 0; j < a.length; j++) {
				System.out.println(a[j]);
			}

		} else {
			IntStream.range(1, n + 1).forEach(ele -> {
				if (!used.containsKey(ele)) {
					System.out.println("using " + ele + " at position " + i);
					a[i] = ele;
					used.put(ele, true);
					backTracking(i + 1, a, used);
					used.remove(ele);
				}
			});
		}

	}
}
