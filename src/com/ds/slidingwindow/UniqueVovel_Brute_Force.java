package com.ds.slidingwindow;

import java.util.HashMap;

public class UniqueVovel_Brute_Force {
	public static void main(String[] args) {
		Brute_Force("abcde", 4);
	}

	private static void Brute_Force(String input, int winodwSize) {
		for (int i = 0; i <= input.length() - winodwSize; i++) {
			HashMap<Character, Integer> ht = new HashMap<>();
			for (int j = i; j < i + winodwSize; j++) {
				add(ht, input.charAt(j));
			}
			print(ht);
		}
	}

	private static void add(HashMap<Character, Integer> ht, Character key) {
		if (ht.containsKey(key)) {
			ht.put(key, ht.get(key) + 1);
		} else {
			if (key.equals('a') || key.equals('e') || key.equals('i') || key.equals('o') || key.equals('u'))
				ht.put(key, 1);
		}
	}

	private static void print(HashMap<Character, Integer> ht) {
		System.out.println(ht.keySet());
//		for (Character c : ht.keySet())
//			System.out.println(c);
	}

}
