package com.lmr.LeetCode;

/**
 * 11. 盛最多水的容器
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0) 。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 说明：你不能倾斜容器。
 *
 *
 *
 * 示例 1：
 *
 *
 *
 * 输入：[1,8,6,2,5,4,8,3,7]
 * 输出：49
 * 解释：图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
 * 示例 2：
 *
 * 输入：height = [1,1]
 * 输出：1
 * 示例 3：
 *
 * 输入：height = [4,3,2,1,4]
 * 输出：16
 * 示例 4：
 *
 * 输入：height = [1,2,1]
 * 输出：2
 *
 *
 * 提示：
 *
 * n = height.length
 * 2 <= n <= 3 * 104
 * 0 <= height[i] <= 3 * 104
 */
public class LC_11 {

    public int maxArea1(int[] height) {

        int max, minh;

        max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                minh = Math.min(height[i], height[j]);
                max = Math.max(max, minh * (j - i));
            }
        }

        return max;

    }

    public int maxArea2(int[] height) {

        int max, maxindex, minh;

        max = 0;

        for (int i = 0; i < height.length; i++) {
            maxindex = i;
            for (int j = i + 1; j < height.length; j++) {
                if (height[j] > height[i] && maxindex == i) {
                    maxindex = j;
                    minh = height[i];
                } else {
                    minh = height[j];
                }
                if (minh * (j - i) > max) {
                    max = minh * (j - i);
                }
//				minh=Math.min(height[i], height[j]);
//				max=Math.max(max, minh*(j-i));
            }
            if (maxindex == i) {
                break;
            } else {
                i = maxindex - 1;
            }
        }

        return max;

    }

    public int maxArea3(int[] height) {

        int max, left, right;

        max = 0;
        left = 0;
        right = height.length - 1;

        while (left < right) {

            if (height[left] < height[right]) {
                max = Math.max(max, height[left] * (right - left));
                left++;
            } else {
                max = Math.max(max, height[right] * (right - left));
                right--;
            }

        }

        return max;

    }

    public int maxArea4(int[] height) {
        int l = 0, r = height.length - 1, max = 0, size, ml = 0, mr = 0;
        while (l < r) {
            while (l < r) {
                if (height[l] > ml) {
                    break;
                }
                l++;
            }
            while (l < r) {
                if (height[r] > mr) {
                    break;
                }
                r--;
            }
            if (height[l] < height[r]) {
                size = height[l] * (r - l);
                ml = height[l];
                l++;
            } else {
                size = height[r] * (r - l);
                mr = height[r];
                r--;
            }
            max = Math.max(max, size);
        }
        return max;
    }

    public static void main(String[] args) {

    }

}
