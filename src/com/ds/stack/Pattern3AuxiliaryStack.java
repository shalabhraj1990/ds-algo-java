package com.ds.stack;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Pattern3AuxiliaryStack {
	public static void main(String[] args) {
		int[] cards = { 70,37,70,41,1,62,71,49,38,50,29,76,29,41,22,66,88,18,85,53};
		System.out.println(removeDigit(cards));
	}

	public static int removeDigit(int[] cards) {
		int n = cards.length;
		Set<Integer> cards1 = new TreeSet<Integer>();
		for (int i = 0; i < n; i++) {
			cards1.add(cards[i]);
		}
		int dif = n - cards1.size();
		if (dif == 0) {
			return -1;
		}
		return dif * 2;

	}

}
