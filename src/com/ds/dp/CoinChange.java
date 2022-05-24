package com.ds.dp;

import java.util.Hashtable;

public class CoinChange {
	private static final int[] coins = { 1, 2, 3 };
	private static final int m = coins.length;
	private static final Hashtable<Tuple2<Integer, Integer>, Integer> ht = new Hashtable<>();

	public static void main(String[] args) {
		int n = 2;
		System.out.println(f(n, 0));
	}

	private static int f(int sumVal, int i) {
		if (sumVal == 0) {
			return 1;
		}

		if (i == m) {
			return 0;
		}

		else {
			if (ht.containsKey(new Tuple2(sumVal, i))) {
				return ht.get(new Tuple2(sumVal, i));
			} else {
				int ans = 0;
				if (sumVal >= coins[i]) {
					ans = f(sumVal, i + 1) + f(sumVal - coins[i], i);
				} else
					ans = f(sumVal, i + 1);

				ht.put(new Tuple2(sumVal, i), ans);
				return ans;
			}

		}
	}

	private static class Tuple2<T1, T2> {
		private T1 t1;
		private T2 t2;

		Tuple2(T1 t1, T2 t2) {
			this.t1 = t1;
			this.t2 = t2;
		}

	}

}
