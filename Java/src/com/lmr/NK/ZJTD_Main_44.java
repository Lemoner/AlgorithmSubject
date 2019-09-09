package com.lmr.NK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ZJTD_Main_44 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        char[] str = in.nextLine().toCharArray();

        StringBuilder sb = new StringBuilder();

        int[] flag = new int[str.length];
        for (int i = 1; i < str.length; i++) {
            if (str[i] == '0') {
                flag[i - 1] = 1;
            }
        }

        DFS(0, str, flag, sb);

    }

    private static void DFS(int index, char[] str, int[] flag, StringBuilder sb) {

        if (index == str.length) {
            System.out.println(sb.toString());
            return;
        }

        int x = str[index] - '0';

        if (flag[index] == 1) {
            int y = str[index + 1] - '0';
            sb.append((char) ('A' + x * 10 + y - 1));
            DFS(index + 2, str, flag, sb);
            sb.deleteCharAt(sb.length() - 1);
        } else {
            sb.append((char) ('A' + x - 1));
            DFS(index + 1, str, flag, sb);
            sb.deleteCharAt(sb.length() - 1);

            if (index + 1 < str.length && flag[index + 1] != 1) {
                int y = str[index + 1] - '0';
                if (x == 1 || (x == 2 && y <= 6)) {
                    sb.append((char) ('A' + x * 10 + y - 1));
                    DFS(index + 2, str, flag, sb);
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
        }

    }

}
