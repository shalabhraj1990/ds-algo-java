package com.ds.dp;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
	public static void main(String[] args) {
// 0 1 1 2 3 5
		System.out.println(fibonacciRecursion(50));
		
	}
	
	private static int fibonacciRecursion(int n) {
		//System.out.println(n);
		Map<Integer,Integer> map = new HashMap<>();
		if(n ==1 || n ==2) 
			return 1;

		else 
			if(map.containsKey(n)) {
				return map.get(n);
			}
			else {
				int val = fibonacciRecursion(n-1) + fibonacciRecursion(n-2); 
				map.put(n, val);
				return val;
			}
			
	}
	

}
