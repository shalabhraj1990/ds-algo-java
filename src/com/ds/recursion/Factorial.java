package com.ds.recursion;

public class Factorial {
	public static void main(String[] args) {
		int ans = factorial(3);
		System.out.println("factorial" + ans);
		int ans2 = factorialWihtForLoop(3);
		System.out.println("factorial" + ans2);
		int ans3 = factorialWithWile(3);
		System.out.println("factorial" + ans3);

	}

	private static int factorial(int n) {
		if (n == 1)
			return n;
		else
			return n * factorial(n - 1);

	}

	private static int factorialWihtForLoop(int n) {
		int sum = 1;
		if (n == 1)
			return 1;
		for (int i = 1; i <= n; i++) {
			sum *= i;
		}
		return sum;
	}

	private static int factorialWithWile(int n) {
		int i = 1;
		int sum = 1;
		while (i <= n) {
			sum *= i;
			i++;
		}

		return sum;
	}
}
