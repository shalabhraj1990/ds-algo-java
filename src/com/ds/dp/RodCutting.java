package com.ds.dp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

public class RodCutting {
	private static Hashtable<Integer, Integer> priceTable = new Hashtable<>();
	private static Hashtable<Integer, Integer> dp = new Hashtable<>();
	static {
		priceTable.put(1, 1);
		priceTable.put(2, 5);
		priceTable.put(3, 8);
		priceTable.put(4, 9);
		priceTable.put(5, 10);
		priceTable.put(6, 17);
		priceTable.put(7, 17);
		priceTable.put(8, 20);
	}

	public static void main(String[] args) {
		System.out.println(f(8));
	}

	private static int f(int x) {
		if (x == 0) {
			return 0;
		} else if (x == 1) {
			return priceTable.get(x);
		}

		else {
			if(!dp.contains(x)) {
				List<Integer> profits = new ArrayList<>();
				priceTable.forEach((cut, value) -> {
					if (cut <= x) {
						profits.add(priceTable.get(cut) + f(x - cut));
					}
				});

				dp.put(x, Collections.max(profits)) ;
				return dp.get(x);
			}
			else {
				return dp.get(x);
			}
			
		}

	}

}
