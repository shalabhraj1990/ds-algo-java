package com.ds.hundred;

public class Day11 {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		int[] output = productExceptSelf(nums);
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}

	public static int[] productExceptSelf(int[] nums) {
		int[] left = new int[nums.length];
		int[] rigth = new int[nums.length];
		int n = nums.length;
		left[0] = 1;
		for (int i = 1; i < nums.length; i++) {
			left[i] = left[i - 1] * nums[i - 1];
		}
		rigth[n - 1] = 1;
		for (int i = n - 2; i >= 0; i--) {
			rigth[i] = rigth[i + 1] * nums[i + 1];
		}
		int[] output = new int[n];
		for (int i = 0; i < n; i++) {
			output[i] = left[i] * rigth[i];
		}
		return output;
	}
}
