package com.ds.hundred;

import java.util.HashMap;
import java.util.Map;

public class Day21TargetSum {
	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 1, 1 };
		int target = 3;

		Map<String, Integer> map = new HashMap<>();

		System.out.println( f(0, target,nums, map));
	}
	
	

	private static int f(int i, int reqSum, int[] nums, Map<String, Integer> map) {
		if (i == nums.length - 1) {
			if (reqSum == 0 && nums[i] == 0) {
				return 2;
			} else if (reqSum != 0 && Math.abs(reqSum) == Math.abs(nums[i])) {
				return 1;
			}
			return 0;
		} else {
			String key = i + ":" + reqSum;
			if (!map.containsKey(key)) {
				int ans = f(i + 1, reqSum - nums[i], nums, map) + f(i + 1, reqSum + nums[i], nums, map);
				map.put(key, ans);
			}
			return map.get(key);
		}
	}
}
