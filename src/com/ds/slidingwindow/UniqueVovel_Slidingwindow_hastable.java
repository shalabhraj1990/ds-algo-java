package com.ds.slidingwindow;

import java.util.HashMap;

public class UniqueVovel_Slidingwindow_hastable {
	public static void main(String[] args) {
		slidingWindow("hellowworld", 4);
	}

	private static void slidingWindow(String input, int windowSize) {
		HashMap<Character, Integer> ht = new HashMap<>();
		int start = 0;
		int n = input.length();
		int i = 0;
		while (i < windowSize) {
			add(ht, input.charAt(i));
			i++;
		}
		uniqueChar(ht);

		while (i < n) {
			remove(ht, input.charAt(start));
			add(ht, input.charAt(i));
			i++;
			start++;
			uniqueChar(ht);
		}

	}

	private static void uniqueChar(HashMap<Character, Integer> ht) {
		int count = 0;
		for (Character c : ht.keySet())
			if (ht.get(c) > 0 && (c.equals('a') || c.equals('e') || c.equals('i') || c.equals('o') || c.equals('u'))) {
				count++;
			}
		System.out.println("Vovel counts :" + count);
	}

	private static void add(HashMap<Character, Integer> ht, Character c) {
		if (ht.containsKey(c)) {
			ht.put(c, ht.get(c) + 1);
		} else
			ht.put(c, 1);

	}

	private static void remove(HashMap<Character, Integer> ht, Character c) {
		ht.put(c, ht.get(c) - 1);
	}
}
