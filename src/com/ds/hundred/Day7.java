package com.ds.hundred;

public class Day7 {
	public static void main(String[] args) {
		int[] nums = {1,3,5,6};int target = 5;
		System.out.println(searchInsert(nums,target));
	}

	public static int searchInsert(int[] nums, int target) {
		int ans = nums.length;
		int start = 0, end = nums.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (nums[mid] < target) {
				start = mid + 1;
			} else {
				ans = mid;
				end = mid - 1;
			}

		}
		return ans;
	}
}
