package com.ds.hundred;

public class Day20_Coin_Change {

	public static void main(String[] args) {
		int[] coins = { 1, 2, 5 };
		int amount = 11;
		int[] dp = new int[amount + 1];
		System.out.println(f(amount, coins, dp));
	}

	private static int f(int i, int[] coins, int[] dp) {
		if (i <= 0) {
			return 0;
		} else {
			int ans = -1;
			if (dp[i] != 0) {
				return dp[i];
			}
			for (int coin : coins) {
				if (coin <= i) {
					int val = f(i - coin, coins, dp);
					if (val != -1 && (ans == -1 || val + 1 < ans)) {
						ans = val + 1;
					}
				}
			}
			dp[i] = ans;
			return ans;
		}

	}
}
