package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class JD_RadixAverage {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n, sum, g;

		while (scanner.hasNext()) {
			n = scanner.nextInt();
			sum = 0;
			for (int i = 2; i < n; i++) {
				sum += fun(n, i);
			}
			
			g=gcd(sum, n-2);
			System.out.println(sum/g + "/" + (n - 2)/g);
		}

	}

	public static int gcd(int m, int n) {

		while (true) {

			if ((m = m % n) == 0)

				return n;

			if ((n = n % m) == 0)

				return m;

		}

	}

	private static int fun(int n, int r) {

		int sum = 0;
		while (n >= r) {
			sum += n % r;
			n = n / r;
		}
		sum += n;
		return sum;
	}

}
