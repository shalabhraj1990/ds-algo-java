package com.ds.hundred;

public class Day8 {

	public static void main(String[] args) {
		int[] nums = {2,0,0};
		System.out.println(canJump(nums));
	}

	public static boolean canJump(int[] nums) {
		if (nums.length == 1) {
			return true;
		}
		int maxReachable = nums[0];
		int i = 1;
		while (i < nums.length && maxReachable >= i) {
			if (nums[i] + i > maxReachable) {
				maxReachable = nums[i] + i;
			}
			i++;
		}
		if (maxReachable >= nums.length - 1) {
			return true;
		}
		return false;
	}
}
