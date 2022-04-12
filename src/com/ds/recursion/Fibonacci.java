package com.ds.recursion;

public class Fibonacci {
	public static void main(String[] args) {
// 0 1 1 2 3 5
		System.out.println(fibonacciRecursion(50));
		
	}
	
	private static int fibonacciRecursion(int n) {
		if(n ==1 || n ==2) 
			return 1;

		else 
			return fibonacciRecursion(n-1) + fibonacciRecursion(n-2); 
	}
	

}
