package com.ds.dp;

import java.util.Hashtable;

public class HouseRobber {
	public static int[] house = { 9, 20, 11, 8 };
	public static int n = house.length;
	public static Hashtable<Integer, Integer> dp = new Hashtable<Integer, Integer>();

	public static void main(String[] args) {
		System.out.println(f(0));
	}

	public static int f(int i) {
		if (i >= n) {
			return 0;
		} else {
			if (dp.contains(i)) {
				return dp.get(i);
			} else {
				dp.put(i, Math.max(house[i] + f(i + 2), f(i + 1)));
			}
			return dp.get(i);

		}

	}
}
