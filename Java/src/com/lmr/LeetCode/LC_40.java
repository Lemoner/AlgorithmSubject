package com.lmr.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 40. 组合总和 II
 * 给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 * <p>
 * candidates 中的每个数字在每个组合中只能使用一次。
 * <p>
 * 说明：
 * <p>
 * 所有数字（包括目标数）都是正整数。
 * 解集不能包含重复的组合。
 * 示例 1:
 * <p>
 * 输入: candidates = [10,1,2,7,6,1,5], target = 8,
 * 所求解集为:
 * [
 * [1, 7],
 * [1, 2, 5],
 * [2, 6],
 * [1, 1, 6]
 * ]
 * 示例 2:
 * <p>
 * 输入: candidates = [2,5,2,1,2], target = 5,
 * 所求解集为:
 * [
 * [1,2,2],
 * [5]
 * ]
 */
public class LC_40 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        return DFS(candidates, target, candidates.length - 1);
    }

    public List<List<Integer>> DFS(int[] candidates, int target, int index) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = index; i >= 0; i--) {
            if (target > candidates[i]) {
                List<List<Integer>> tmp = DFS(candidates, target - candidates[i], i - 1);
                if (tmp.size() > 0) {
                    for (List<Integer> list : tmp) {
                        list.add(candidates[i]);
                        result.add(list);
                    }
                }
            } else if (target == candidates[i]) {
                List<Integer> list = new ArrayList<>();
                list.add(target);
                result.add(list);
            }
            while (i > 0 && candidates[i] == candidates[i - 1]) {
                i--;
            }
        }
        return result;
    }


    public static void main(String[] args) {

        LC_40 lc = new LC_40();

        int[] candidates = {1, 6, 1};
        int target = 8;

        System.out.println(lc.combinationSum2(candidates, target).toString());

    }

}
