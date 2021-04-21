package com.lmr.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 39. 组合总和
 * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 * <p>
 * candidates 中的数字可以无限制重复被选取。
 * <p>
 * 说明：
 * <p>
 * 所有数字（包括 target）都是正整数。
 * 解集不能包含重复的组合。
 * 示例 1：
 * <p>
 * 输入：candidates = [2,3,6,7], target = 7,
 * 所求解集为：
 * [
 * [7],
 * [2,2,3]
 * ]
 * 示例 2：
 * <p>
 * 输入：candidates = [2,3,5], target = 8,
 * 所求解集为：
 * [
 * [2,2,2,2],
 * [2,3,3],
 * [3,5]
 * ]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= candidates.length <= 30
 * 1 <= candidates[i] <= 200
 * candidate 中的每个元素都是独一无二的。
 * 1 <= target <= 500
 */
public class LC_39 {

    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<Integer> cur = new ArrayList<>();

        DFS(cur, candidates, target, candidates.length - 1);

        return result;

    }

    public void DFS(List<Integer> cur, int[] candidates, int target, int index) {

        if (target == 0) {
            result.add(new ArrayList<>(cur));
            return;
        } else if (target < 0) {
            return;
        } else {
            for (int i = index; i >= 0; i--) {
                if (target - candidates[i] >= 0) {
                    cur.add(candidates[i]);
                    DFS(cur, candidates, target - candidates[i], i);
                    cur.remove(cur.size() - 1);
                }
            }
        }

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        return DFS(candidates, target, candidates.length - 1);
    }

    public List<List<Integer>> DFS(int[] candidates, int target, int index) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = index; i >= 0; i--) {
            if (target > candidates[i]) {
                List<List<Integer>> tmp = DFS(candidates, target - candidates[i], i);
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
        }
        return result;
    }

    public static void main(String[] args) {

        LC_39 lc = new LC_39();

        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        System.out.println(lc.combinationSum(candidates, target).toString());

    }

}
