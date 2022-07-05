package com.ds.hundred;

import java.util.HashMap;
import java.util.Map;

public class Day5 {
	public static Map<Integer, Integer> map = new HashMap<>();

	public static void main(String[] args) {
		System.out.println(f(0, 3));
	}

	public static int f(int i, int n) {

		if (i > n) {
			return 0;
		} else if (i == n) {
			return 1;
		} else {
			if (map.containsKey(i)) {
				return map.get(i);
			}
			{
				int val = f(i + 1, n) + f(i + 2, n);
				map.put(i, val);
				return val;
			}
		}

	}
}
