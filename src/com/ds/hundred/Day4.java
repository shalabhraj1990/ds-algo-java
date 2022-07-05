package com.ds.hundred;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day4 {
	public static void main(String[] args) {
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> triplets = new ArrayList<>();
		int i = 0;
		Arrays.sort(nums);

		while (i < nums.length) {
			if (i == 0 || (i - 1 >= 0 && nums[i - 1] != nums[i])) {
				int firstNum = nums[i];
				int target = -firstNum;
				List<List<Integer>> pairs = twoSum(nums, i + 1, nums.length - 1, target);
				for (List<Integer> pair : pairs) {
					List<Integer> triplet = new ArrayList<>();
					triplet.add(firstNum);
					triplet.add(pair.get(0));
					triplet.add(pair.get(1));
					triplets.add(triplet);
				}
			}
			i++;

		}
		System.out.println(triplets.toString());

	}

	public static List<List<Integer>> twoSum(int[] nums, int start, int end, int target) {
		int f = start;
		int s = end;
		List<List<Integer>> pairs = new ArrayList<>();
		while (f < s) {
			if (f - 1 >= start && nums[f - 1] == nums[f]) {
				f++;
				continue;
			}

			if (s + 1 <= end && nums[s + 1] == nums[s]) {
				s--;
				continue;
			}
			int sum = nums[f] + nums[s];
			if (sum < target)
				f++;
			else if (sum > target)
				s--;
			else {
				List<Integer> pair = new ArrayList<Integer>();
				pair.add(nums[f]);
				pair.add(nums[s]);
				pairs.add(pair);
				f++;
			}

		}
		return pairs;
	}

}
