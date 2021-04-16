package com.lmr.LeetCode;

import java.util.HashMap;

/**
 * 3. 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * 示例 4:
 * <p>
 * 输入: s = ""
 * 输出: 0
 * <p>
 * <p>
 * 提示：
 * <p>
 * 0 <= s.length <= 5 * 104
 * s 由英文字母、数字、符号和空格组成
 */
public class LC_3 {

    public static void main(String[] args) {
        LC_3 lc = new LC_3();
        String s = "abcabcbb";
//        String s = "pwwpkew";
        System.out.println(lc.lengthOfLongestSubstring4(s));
    }

    public int lengthOfLongestSubstring4(String s) {
        int[] tmp = new int[100];
        int max = 0, l = 0, r = 0;
        while (r < s.length()) {
            int index = s.charAt(r) - ' ';
            if (tmp[index] > 0) {
                l = Math.max(l, tmp[index]);
            }
            tmp[index] = r + 1;
            r++;
            max = Math.max(max, r - l);
        }
        return max;
    }

    public int lengthOfLongestSubstring3(String s) {
        int[] tmp = new int[100];
        int max = 0, l = 0, r = 0;
        while (r < s.length()) {
            int index = s.charAt(r) - ' ';
            if (tmp[index] > 0) {
                while (l < tmp[index]) {
                    tmp[s.charAt(l++) - ' '] = 0;
                }
            } else {
                tmp[index] = r + 1;
                r++;
                max = Math.max(max, r - l);
            }
        }
        return max;
    }


    public int lengthOfLongestSubstring1(String s) {
        int start, max;
        start = 0;
        max = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = start; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    start = j + 1;
                    break;
                }
            }
            if (i - start + 1 > max) {
                max = i - start + 1;
            }
        }

        return max;
    }

    public int lengthOfLongestSubstring2(String s) {
        int start, max;
        start = 0;
        max = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (map.containsKey(c)) {
                start = Math.max(start, map.get(c) + 1);
            }
            map.put(c, i);

            max = Math.max(max, i - start + 1);
        }

        return max;
    }


}
