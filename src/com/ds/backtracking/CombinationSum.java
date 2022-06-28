package com.ds.backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
	static final int[] candidates = { 2, 3, 6, 7 };
	static final int target = 7;

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		f(arr, target, 0);
	}

	private static void f(List<Integer> arr, int remSum, int currentIndex) {
		if (currentIndex == candidates.length && remSum == 0) {
			System.out.println(arr.toString());
		} else if (currentIndex < candidates.length) {
			if (remSum >= candidates[currentIndex]) {
				arr.add(candidates[currentIndex]);
				// because i can choose to add same elements
				f(arr, remSum - candidates[currentIndex], currentIndex);
				// remove the side effect of current function
				arr.remove(arr.size() - 1);

			}
			f(arr, remSum, currentIndex + 1);
		}
	}
}
