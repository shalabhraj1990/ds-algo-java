package com.ds.hundred;

public class Day27MoveZeroes {

	public static void main(String[] args) {
		int[] nums = { 0, 1, 0, 3, 12 };
		moveZeroes(nums);
		System.out.println(nums);
	}

	public static void moveZeroes(int[] nums) {
		int start = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				int temp = nums[start];
				nums[start] = nums[i];
				nums[i] = temp;
				start++;
			}
		}
	}
}
