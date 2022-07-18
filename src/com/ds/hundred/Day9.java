package com.ds.hundred;

public class Day9 {
	public static void main(String[] args) {
		// int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int[] nums = { 1 };
		// int[] nums = { 5, 4, -1, 7, 8 };

		System.out.println(maxSubArray(nums));
	}

	public static int maxSubArray(int[] nums) {
//		if (nums.length == 1) {
//			return nums[0];
//		}
		int maxSoFar = nums[0];
		int currentSum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (currentSum < 0) {
				currentSum = 0;
			}
			currentSum = currentSum + nums[i];
			if (currentSum > maxSoFar) {
				maxSoFar = currentSum;
			}
		}

		return maxSoFar;
	}
}
