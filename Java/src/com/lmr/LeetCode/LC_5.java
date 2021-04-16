package com.lmr.LeetCode;

/**
 * 5. 最长回文子串
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 *
 *
 *
 * 示例 1：
 *
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 * 示例 2：
 *
 * 输入：s = "cbbd"
 * 输出："bb"
 * 示例 3：
 *
 * 输入：s = "a"
 * 输出："a"
 * 示例 4：
 *
 * 输入：s = "ac"
 * 输出："a"
 *
 *
 * 提示：
 *
 * 1 <= s.length <= 1000
 * s 仅由数字和英文字母（大写和/或小写）组成
 *
 * 五种方法的总结： https://writings.sh/post/algorithm-longest-palindromic-substring
 */
public class LC_5 {

    public String longestPalindrome1(String s) {

        int start, end, max, maxstart, maxend;

        max = 0;
        maxstart = 0;
        maxend = 0;

        for (int i = 0; i < s.length(); i++) {
            start = i;
            end = i;
            while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
                start--;
                end++;
            }
            if (end - start - 1 > max) {
                max = end - start - 1;
                maxstart = start + 1;
                maxend = end - 1;
            }

            start = i;
            end = i + 1;
            while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
                start--;
                end++;
            }
            if (end - start - 1 > max) {
                max = end - start - 1;
                maxstart = start + 1;
                maxend = end - 1;
            }
        }

        return s.substring(maxstart, maxend + 1);

    }

    public String longestPalindrome2(String s) {

        StringBuffer sb = new StringBuffer();

        sb.append('#');
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            sb.append('#');
        }

        String ns = sb.toString();

        int start, end, max, maxstart, maxend;

        max = 0;
        maxstart = 0;
        maxend = 0;

        for (int i = 0; i < ns.length(); i++) {

            start = i;
            end = i;
            while (start >= 0 && end < ns.length() && ns.charAt(start) == ns.charAt(end)) {
                start--;
                end++;
            }
            if (end - start - 1 > max) {
                max = end - start - 1;
                maxstart = start + 1;
                maxend = end - 1;
            }

        }

        return s.substring(maxstart / 2, maxend / 2);

    }

    public String longestPalindrome3(String s) {

        StringBuffer sb = new StringBuffer();

        sb.append('#');
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            sb.append('#');
        }

        String ns = sb.toString();

        int p, mid, max, maxstart, maxend;
        int[] len = new int[ns.length()];

        p = 0;
        mid = 0;
        max = 0;
        maxstart = 0;
        maxend = 0;
        len[0] = 1;

        for (int i = 1; i < ns.length(); i++) {

            if (i < p) {
                len[i] = Math.min(p - i, len[2 * mid - i]);
            } else {
                len[i] = 1;
            }

            while (i - len[i] >= 0 && i + len[i] < ns.length() && ns.charAt(i - len[i]) == ns.charAt(i + len[i])) {
                len[i]++;
            }

            if (i + len[i] > p) {
                p = i + len[i];
                mid = i;

                if (max < len[i] - 1) {
                    max = len[i] - 1;
                    maxstart = i - len[i] + 1;
                    maxend = i + len[i] - 1;
                }

            }

        }

        return s.substring(maxstart / 2, maxend / 2);
    }

    public String longestPalindrome4(String s) {
        int maxSize = 0, maxIndex = 0, l, r;
        char[] str = new char[s.length() * 2 + 1];
        str[0] = ' ';
        for (int i = 1; i < str.length; i++) {
            str[i] = s.charAt(i / 2);
            i++;
            str[i] = ' ';
        }
        for (int i = 0; i < str.length; i++) {
            l = i - 1;
            r = i + 1;
            while (l >= 0 && r < str.length) {
                if (str[l] != str[r]) {
                    break;
                }
                l--;
                r++;
            }
            if (r - l - 1 > maxSize) {
                maxSize = r - l - 1;
                maxIndex = l + 1;
            }
        }
        System.out.println(maxIndex);
        System.out.println(maxSize);
        return s.substring((maxIndex + 1) / 2, (maxIndex + 1) / 2 + (maxSize - 1) / 2);
    }

    public static void main(String[] args) {

        LC_5 lc = new LC_5();

//		String s="cbbd";
        String s = "babad";
//        String s = "bbb";
        System.out.println(lc.longestPalindrome4(s));

    }

}
