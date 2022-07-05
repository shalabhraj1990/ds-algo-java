package com.ds.hundred;

public class Day2 {
	public static void main(String[] args) {
		//https://leetcode.com/problems/single-number/
		int[] nums = { 2, 2, 1 };
		System.out.println(singleNumber(nums));
	}

	public static int singleNumber(int[] nums) {
		int ans = 0;
		for (int i : nums) {
			ans = ans ^ i;
		}
		return ans;
	}

}
