package com.lmr.NK;

import java.util.Scanner;

public class ZY_Main_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        long[] a = new long[n + 1];
        long[] b = new long[n];

        for (int i = 0; i < n + 1; i++) {
            a[i] = scanner.nextLong();
        }

        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextLong();
        }

        long t, sum = 0;

        for (int i = 0; i < n; i++) {
            t = b[i] - a[i];
            if (t <= 0) {
                sum += b[i];
            } else {
                sum += a[i];
                if (t >= a[i + 1]) {
                    sum += a[i + 1];
                    a[i + 1] = 0;
                } else {
                    sum += t;
                    a[i + 1] -= t;
                }
            }
        }

        System.out.println(sum);

    }

}
