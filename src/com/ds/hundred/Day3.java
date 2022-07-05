package com.ds.hundred;

public class Day3 {
	public static void main(String[] args) {
		int[] numbers = { 2, 7, 11, 15 };
		int target = 9;
		System.out.println(twoSum(numbers, target));
	}

	public static int[] twoSum(int[] numbers, int target) {
		int f = 0;
		int s = numbers.length - 1;
		int[] ans = new int[2];
		while (f < s) {
			int sum = numbers[f] + numbers[s];
			if (sum > target) {
				s--;
			} else if (sum < target) {
				f++;
			} else {
				ans[0] = f + 1;
				ans[1] = s + 1;
				break;
			}
		}

		return ans;

	}
}
