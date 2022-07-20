package com.ds.hundred;

public class Day12 {
	public static void main(String[] args) {
		int[] nums = { 2, 0, 2, 1, 1, 0 };

		sortColors(nums);
	}

	public static void sortColors(int[] nums) {
		int left = 0;
		int rigth = nums.length - 1;
		int i = 0;
		while (i <= rigth) {
			if (nums[i] == 0) {
				int temp = nums[i];
				nums[i] = nums[left];
				nums[left] = temp;
				i++;
				left++;

			} else if (nums[i] == 2) {
				int temp = nums[i];
				nums[i] = nums[rigth];
				nums[rigth] = temp;
				rigth--;
			} else {
				i++;
			}
		}
		// print the output
		for (int j = 0; j < nums.length; j++) {
			System.out.println(nums[j]);
		}

	}
}
