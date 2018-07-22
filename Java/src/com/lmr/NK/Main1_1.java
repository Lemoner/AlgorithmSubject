package com.lmr.NK;

import java.util.Formatter;
import java.util.Scanner;

public class Main1_1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int[] x = new int[14];
		int[] y = new int[46];
		int a, b, s, t, m, index;
		float c;

		while (in.hasNextInt()) {

			for (int i = 1; i <= 13; i++) {
				x[i] = 4;
			}

			a = 0;
			b = 0;
			t = 0;
			m = 0;

			for (int i = 1; i <= 3; i++) {
				s = in.nextInt();
				a += s;
				x[s]--;
			}

			for (int i = 1; i <= 3; i++) {
				s = in.nextInt();
				b += s;
				x[s]--;
			}

			index = 0;
			for (int i = 1; i <= 13; i++) {
				for (int j = 0; j < x[i]; j++) {
					y[index++] = i;
				}
			}

			for (int i = 0; i < index; i++) {
				for (int j = 0; j < index; j++) {
					if (i != j) {
						m++;
						if (a + y[i] - b - y[j] > 0) {
							t++;
						}
					}
				}
			}

			c = (float) (t * 1.0 / m);

			System.out.println(new Formatter().format("%.4f", c).toString());
		}

	}

}
