package com.lmr.LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * 示例 2：
 *
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * 示例 3：
 *
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 *  
 *
 * 提示：
 *
 * 2 <= nums.length <= 103
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * 只会存在一个有效答案
 */
public class LC_1 {

    public int[] twoSum1(int[] nums, int target) {
        int x, y, flag;
        x = 0;
        y = 0;
        flag = 0;
        for (x = 0; x < nums.length; x++) {
            for (y = x + 1; y < nums.length; y++) {
                if (nums[x] + nums[y] == target) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                break;
            }
        }
        int[] result = new int[2];
        result[0] = x;
        result[1] = y;
        return result;
    }

    public int[] twoSum2(int[] nums, int target) {
        Arrays.sort(nums);
        int x, y, sum;
        x = 0;
        y = nums.length - 1;
        for (; x < y; ) {
            sum = nums[x] + nums[y];
            if (sum == target) {
                break;
            } else if (sum > target) {
                y--;
            } else {
                x++;
            }
        }
        int[] result = new int[2];
        result[0] = x;
        result[1] = y;
        return result;
    }

    public int[] twoSum3(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            Integer index = map.get(target - nums[i]);
            if (index != null) {
                result[0] = i;
                result[1] = index;
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }

}
