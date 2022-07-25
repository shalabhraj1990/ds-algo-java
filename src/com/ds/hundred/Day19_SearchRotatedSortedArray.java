package com.ds.hundred;

public class Day19_SearchRotatedSortedArray {
	public static void main(String[] args) {
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		System.out.println(search(nums, 0));
	}

	public static int search(int[] nums, int target) {

		int start = 0, end = nums.length - 1, ans = -1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (nums[mid] >= nums[0] && target < nums[0]) {
				start = mid + 1;
			} else if (nums[mid] < nums[0] && target >= nums[0]) {
				end = end - 1;
			} else {
				if (nums[mid] < target) {
					start = mid + 1;
				} else if (nums[mid] > target) {
					end = end - 1;
				} else {
					ans = mid;
					break;
				}
			}
		}

		return ans;

	}
}
