package com.ds.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combination {
	private static int n = 4;
	private static int k = 3;

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		f(a, 1);
	}

	private static void f(List<Integer> a, int currentNo) {
		if (currentNo == n + 1 && a.size() == k) {
			System.out.println(a.toString());
		} else if (currentNo < n + 1) {
			if (a.size() < k) {
				a.add(currentNo);
				f(a, currentNo + 1);
				a.remove(a.size() - 1);
			}
			f(a, currentNo + 1);
		}
	}
}
