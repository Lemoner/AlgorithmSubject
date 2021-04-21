package com.lmr.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15. 三数之和
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 * <p>
 * 注意：答案中不可以包含重复的三元组。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [-1,0,1,2,-1,-4]
 * 输出：[[-1,-1,2],[-1,0,1]]
 * 示例 2：
 * <p>
 * 输入：nums = []
 * 输出：[]
 * 示例 3：
 * <p>
 * 输入：nums = [0]
 * 输出：[]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 0 <= nums.length <= 3000
 * -105 <= nums[i] <= 105
 */
public class LC_15 {

    public List<List<Integer>> threeSum(int[] nums) {

        int index, left, mid, right, sum;
        List<List<Integer>> resultlist = new ArrayList<>();

        Arrays.sort(nums);

        for (left = 0; left < nums.length && nums[left] <= 0; ) {

            mid = left + 1;
            right = nums.length - 1;

            while (mid < right) {
                sum = nums[left] + nums[mid] + nums[right];
                if (sum == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[left]);
                    list.add(nums[mid]);
                    list.add(nums[right]);
                    resultlist.add(list);

                    index = 1;
                    while (mid + index < right && nums[mid] == nums[mid + index]) {
                        index++;
                    }
                    mid = mid + index;

                    index = 1;
                    while (right - index > mid && nums[right] == nums[right - index]) {
                        index++;
                    }
                    right = right - index;

                } else if (sum < 0) {
                    mid++;
                } else {
                    right--;
                }

            }

            index = 1;
            while (left + index < nums.length && nums[left] == nums[left + index]) {
                index++;
            }
            left = left + index;

        }

        return resultlist;

    }

    public List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 3) {
            return result;
        }
        Arrays.sort(nums);
        int l, r;
        for (int i = 0; i < nums.length && nums[i] < 1; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            l = i + 1;
            r = nums.length - 1;
            while (l < r) {
                if (nums[l] + nums[r] == -nums[i]) {
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while (l < r && nums[l++] == nums[l]) {
                    }
                    while (r > l && nums[r--] == nums[r]) {
                    }
                } else if (nums[l] + nums[r] > -nums[i]) {
                    // while (r > l && nums[r--] == nums[r]) {
                    // }
                    r--;
                } else {
                    l++;
                    // while (l < r && nums[l++] == nums[l]) {
                    // }
                }
            }
        }
        return result;
    }

    public List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 3) {
            return result;
        }
        Arrays.sort(nums);
        int k;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                k = findNum(nums, j + 1, nums.length - 1, 0 - nums[i] - nums[j]);
                if (k != -1) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                }
                while (j < nums.length - 1 && nums[j] == nums[j + 1]) {
                    j++;
                }
            }
            while (i < nums.length - 2 && nums[i] == nums[i + 1]) {
                i++;
            }
        }
        return result;
    }

    public int findNum(int[] nums, int l, int r, int x) {
        if (nums[l] > x || nums[r] < x) {
            return -1;
        }
        int mid = (l + r) / 2;
        while (l <= mid && mid <= r) {
            if (nums[mid] == x) {
                return mid;
            } else if (nums[mid] > x) {
                mid = (mid - 1 + l) / 2;
            } else {
                mid = (mid + 1 + r) / 2;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        LC_15 lc = new LC_15();

        int[] nums = {-1, 0, 1, 2, -1, -4};

        System.out.println(lc.threeSum2(nums));

    }

}
