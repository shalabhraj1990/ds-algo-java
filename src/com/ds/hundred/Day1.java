package com.ds.hundred;

public class Day1 {
	public static void main(String[] args) {
		//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(prices));
	}

	public static int maxProfit(int[] prices) {
		int ans = 0;
		int minSoFar = prices[0];

		for (int i = 0; i < prices.length; i++) {
			int currentprofit = prices[i] - minSoFar;
			if (currentprofit > ans) {
				ans = currentprofit;
			}
			minSoFar = Math.min(minSoFar, prices[i]);
		}
		return ans;

	}

}
