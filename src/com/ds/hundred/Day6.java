package com.ds.hundred;

public class Day6 {
	public static void main(String[] args) {
		int n = 5;
		int[] result = new int[n + 1];

		for (int i = 0; i <= n; i++) {
			result[i] = getNoOfSetBits(i);
		}

		System.out.println(result.toString());
	}

	public static int getNoOfSetBits(int num) {
		int count = 0;
		for (int i = 0; i <= 31; i++) {
			if ((num & (1 << i)) > 0)
				count++;
		}
		return count;
	}
}
