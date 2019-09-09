package com.lmr.NK;

import java.util.Scanner;

public class ZJTD_Main_41 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }

        System.out.println(Fun(n, x));
    }

    private static int Fun(int n, int[] x) {

        int max = 0, maxindex = 0;

        for (int i = 0; i < x.length; i++) {
            int sum = 0, high = 0;
            for (int j = i + 1; j < x.length; j++) {
                if (high >= x[j]) {
                    continue;
                } else {
                    high = x[j];
                }
                if (high <= x[i]) {
                    sum++;
                } else {
                    break;
                }
            }
            if (sum > max) {
                max = sum;
                maxindex = x[i];
            }
        }

        return maxindex;

    }

}
