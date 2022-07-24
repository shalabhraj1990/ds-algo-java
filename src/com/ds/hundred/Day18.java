package com.ds.hundred;

public class Day18 {

	public static void main(String[] args) {
		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int target = 8;
		int[] ans = new int[2];
		ans[0] = findLeft(nums, target);
		ans[1] = findRight(nums, target);

		System.out.println(ans);
	}

	public static int findLeft(int[] nums, int target) {
		int start = 0, end = nums.length - 1, ans = -1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (nums[mid] < target) {
				start = mid + 1;

			} else if (nums[mid] > target) {
				end = mid - 1;
			} else {
				ans = mid;
				end = mid - 1;
			}
		}
		return ans;
	}

	public static int findRight(int[] nums, int target) {
		int start = 0, end = nums.length - 1, ans = -1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (nums[mid] < target) {
				start = mid + 1;

			} else if (nums[mid] > target) {
				end = mid - 1;
			} else {
				ans = mid;
				start = mid + 1;
			}
		}
		return ans;
	}

}
