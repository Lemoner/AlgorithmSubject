package com.lmr.NK;

import java.util.LinkedList;
import java.util.Scanner;

public class WB_Main_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println(splitArray(nums, k));

    }

    public static int splitArray(int[] nums, int k) {
        //取出最大值和最小值
        int max = 0;
        long sum = 0;
        for (int num : nums) {
            max = Math.max(num, max);
            sum += num;
        }
        if (k == 1) return (int) sum;
        //binary search
        long l = max;
        long r = sum;
        while (l <= r) {
            long mid = (l + r) / 2;
            //调用valid函数判断当前值是否满足条件
            if (valid(mid, nums, k)) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return (int) l;
    }

    public static boolean valid(long target, int[] nums, int k) {
        int count = 1;
        long total = 0;
        //对数组进行分段求和，每当和大于target时，就重新求和，如果数组总数大于k，则说明target太小，需要增加，返回false
        for (int num : nums) {
            total += num;
            if (total > target) {
                total = num;
                count++;
                if (count > k) {
                    return false;
                }
            }
        }
        return true;
    }


}
