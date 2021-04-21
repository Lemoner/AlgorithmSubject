package com.lmr.LeetCode;

/**
 * 42. 接雨水
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * <p>
 * 输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * 输出：6
 * 解释：上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。
 * 示例 2：
 * <p>
 * 输入：height = [4,2,0,3,2,5]
 * 输出：9
 * <p>
 * <p>
 * 提示：
 * <p>
 * n == height.length
 * 0 <= n <= 3 * 104
 * 0 <= height[i] <= 105
 */
public class LC_42 {

    public int trap1(int[] height) {
        if (height.length == 0) {
            return 0;
        }
        int sum = 0, maxIndex = 0, index, high;
        for (int i = 0; i < height.length; i++) {
            if (height[i] > height[maxIndex]) {
                maxIndex = i;
            }
        }
        index = 0;
        high = height[index];
        while (++index < maxIndex) {
            if (height[index] > high) {
                high = height[index];
                continue;
            }
            sum += high - height[index];
        }
        index = height.length - 1;
        high = height[index];
        while (--index > maxIndex) {
            if (height[index] > high) {
                high = height[index];
                continue;
            }
            sum += high - height[index];
        }
        return sum;
    }

    public int trap(int[] height) {

        int left, right, index, result;

        left = 0;
        right = height.length - 1;
        result = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                index = left + 1;
                while (index < right && height[index] <= height[left]) {
                    result += height[left] - height[index];
                    index++;
                }
                left = index;
            } else {
                index = right - 1;
                while (index > left && height[index] <= height[right]) {
                    result += height[right] - height[index];
                    index--;
                }
                right = index;
            }
        }

        return result;

    }

    public static void main(String[] args) {

        LC_42 lc = new LC_42();

        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        System.out.println(lc.trap(height));

    }

}
