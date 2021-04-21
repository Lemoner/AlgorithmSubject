package com.lmr.LeetCode;

import java.util.Arrays;

/**
 * 31. 下一个排列
 * 实现获取 下一个排列 的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
 *
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 *
 * 必须 原地 修改，只允许使用额外常数空间。
 *
 *
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,3]
 * 输出：[1,3,2]
 * 示例 2：
 *
 * 输入：nums = [3,2,1]
 * 输出：[1,2,3]
 * 示例 3：
 *
 * 输入：nums = [1,1,5]
 * 输出：[1,5,1]
 * 示例 4：
 *
 * 输入：nums = [1]
 * 输出：[1]
 *
 *
 * 提示：
 *
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 100
 */
public class LC_31 {

    public void nextPermutation(int[] nums) {

        int index, temp, protemp, x;

        for (index = nums.length - 2; index >= 0; index--) {
            if (nums[index] < nums[index + 1]) {
                break;
            }
        }

        if (index < 0) {
            for (int i = 0; i < nums.length / 2; i++) {
                temp = nums[i];
                nums[i] = nums[nums.length - i - 1];
                nums[nums.length - i - 1] = temp;
            }
        } else {
            x = nums[index];
            Arrays.sort(nums, index, nums.length);
            protemp = nums[index];
            for (int i = index + 1; i < nums.length; i++) {
                if (nums[i] > x) {
                    temp = nums[i];
                    nums[i] = protemp;
                    nums[index] = temp;
                    break;
                } else {
                    temp = nums[i];
                    nums[i] = protemp;
                    protemp = temp;
                }
            }
        }

    }

    public void nextPermutation1(int[] nums) {

        int index;

        for (index = nums.length - 2; index >= 0; index--) {
            if (nums[index] < nums[index + 1]) {
                break;
            }
        }

        if (index < 0) {
            reverse(nums, 0, nums.length - 1);
        } else {
            int i = index + 1;
            while (i < nums.length && nums[i] > nums[index]) {
                i++;
            }
            i--;
            swap(nums, i, index);
            reverse(nums, index + 1, nums.length - 1);
        }

    }

    private void swap(int[] nums, int i, int j) {
        int temp;
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int left, int right) {
        int temp;
        while (left < right) {
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public void nextPermutation2(int[] nums) {
        if (nums.length <= 1) {
            return;
        }
        int index = nums.length - 1;
        while (index > 0) {
            if (nums[index] > nums[index - 1]) {
                break;
            }
            index--;
        }
        int l = index, r = nums.length - 1;
        while (l < r) {
            swapNums(nums, l++, r--);
        }
        if (index == 0) {
            return;
        }
        l = index - 1;
        r = index;
        while (nums[r] <= nums[l]) {
            r++;
        }
        swapNums(nums, l, r);
    }

    public void swapNums(int[] nums, int l, int r) {
        int tmp = nums[l];
        nums[l] = nums[r];
        nums[r] = tmp;
    }

    public static void main(String[] args) {

        LC_31 lc = new LC_31();

        int nums[] = {1, 3, 2, 1};

        System.out.println(Arrays.toString(nums));
        lc.nextPermutation2(nums);
        System.out.println(Arrays.toString(nums));
    }

}
