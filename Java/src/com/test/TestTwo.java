package com.test;

import java.util.Scanner;

public class TestTwo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int nsize = sc.nextInt();
		int[] a = new int[nsize + 1];
		int num, index, count, result;
		count = 0;
		for (int i = 0; i < nsize; i++) {

			num = sc.nextInt();

			if (num > 0) {
				count++;

				a[0] = num;
				index = count;
				while (a[index - 1] > num) {
					a[index] = a[index - 1];
					index--;
				}
				a[index] = num;
			}

		}

		if (count == 0) {
			result = 0;
		} else {
			result = a[1];
			for (int i = 2; i <= count; i++) {
				if (result == a[i] - 1) {
					result = a[i];
				} else {
					break;
				}
			}
		}
		System.out.println(result + 1);
	}

}
