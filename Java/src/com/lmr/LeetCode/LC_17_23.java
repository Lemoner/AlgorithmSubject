package com.lmr.LeetCode;

import java.util.Arrays;

/**
 * 面试题 17.23. 最大黑方阵
 * 给定一个方阵，其中每个单元(像素)非黑即白。设计一个算法，找出 4 条边皆为黑色像素的最大子方阵。
 *
 * 返回一个数组 [r, c, size] ，其中 r, c 分别代表子方阵左上角的行号和列号，size 是子方阵的边长。若有多个满足条件的子方阵，返回 r 最小的，若 r 相同，返回 c 最小的子方阵。若无满足条件的子方阵，返回空数组。
 *
 * 示例 1:
 *
 * 输入:
 * [
 *    [1,0,1],
 *    [0,0,1],
 *    [0,0,1]
 * ]
 * 输出: [1,0,2]
 * 解释: 输入中 0 代表黑色，1 代表白色，标粗的元素即为满足条件的最大子方阵
 * 示例 2:
 *
 * 输入:
 * [
 *    [0,1,1],
 *    [1,0,1],
 *    [1,1,0]
 * ]
 * 输出: [0,0,1]
 * 提示：
 *
 * matrix.length == matrix[0].length <= 200
 *
 * @author lemonlimengran@didichuxing.com
 * @since 2021-04-15
 */
class LC_17_23 {

    public static void main(String[] args) {
        LC_17_23 lc = new LC_17_23();
        int[][] matrix = new int[][]{{0,0,0},{0,1,0},{0,0,0}};
//        int[][] matrix = new int[][]{{1}};
//        int[][] matrix = new int[][]{{1, 1, 1, 0, 1, 1, 0, 1, 0, 0}, {0, 1, 0, 1, 1, 0, 0, 0, 1, 1}, {0, 0, 1, 1, 0, 0, 1, 1, 1, 0}, {0, 1, 1, 1, 0, 1, 0, 0, 1, 0}, {1, 1, 0, 1, 1, 0, 1, 0, 0, 1}, {0, 1, 1, 0, 0, 0, 0, 1, 1, 0}, {1, 0, 0, 0, 0, 1, 1, 1, 1, 1}, {1, 0, 1, 0, 1, 0, 0, 0, 1, 0}, {1, 1, 1, 1, 0, 1, 0, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 0}};
//        int[][] matrix = new int[][]{{1, 1, 1, 1, 0, 1, 0, 1, 1, 1}, {1, 1, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 0, 1, 0, 1, 0, 1}, {1, 1, 1, 1, 0, 0, 0, 0, 0, 0}, {1, 0, 1, 0, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 0, 1, 0, 0, 1}, {0, 0, 0, 1, 1, 1, 0, 1, 0, 1}, {0, 0, 0, 1, 0, 1, 0, 1, 0, 1}, {1, 0, 1, 0, 1, 1, 0, 1, 1, 1}, {1, 1, 1, 0, 1, 0, 0, 1, 1, 1}};
        System.out.println(Arrays.toString(lc.findSquare(matrix)));
    }

    public class Square {
        int r;
        int c;
        int high;
        int width;
        int size;

        Square(int r, int c, int high, int width, int size) {
            this.r = r;
            this.c = c;
            this.high = high;
            this.width = width;
            this.size = size;
        }

        public int[] result() {
            if (r == -1) {
                return new int[]{};
            }
            return new int[]{r, c, size};
        }

        @Override
        public String toString() {
            return "Square{" +
                    "r=" + r +
                    ", c=" + c +
                    ", high=" + high +
                    ", width=" + width +
                    ", size=" + size +
                    '}';
        }
    }

    public int[] findSquare(int[][] matrix) {
        Square max = new Square(-1, -1, 0, 0, 0);
        Square[][] dp = new Square[matrix.length][matrix[0].length];
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = matrix[0].length - 1; j >= 0; j--) {
                if (matrix[i][j] == 1) {
                    dp[i][j] = new Square(i, j, 0, 0, 0);
                    continue;
                }
                if (i == matrix.length - 1 && j == matrix[0].length - 1) {
                    dp[i][j] = new Square(i, j, 1, 1, 1);
                } else if (i == matrix.length - 1) {
                    dp[i][j] = new Square(i, j, 1, dp[i][j + 1].width + 1, 1);
                } else if (j == matrix[0].length - 1) {
                    dp[i][j] = new Square(i, j, dp[i + 1][j].high + 1, 1, 1);
                } else {
                    dp[i][j] = new Square(i, j, dp[i + 1][j].high + 1, dp[i][j + 1].width + 1, calcSize(dp, i, j, Math.min(dp[i + 1][j].high, dp[i][j + 1].width)));
                }
                if (dp[i][j].size >= max.size) {
                    max = dp[i][j];
                }
            }
            System.out.println(Arrays.toString(dp[i]));
        }
        return max.result();
    }

    private int calcSize(Square[][] dp, int i, int j, int t) {
        while (t > 0) {
            if (dp[i + t][j].width >= t + 1 && dp[i][j + t].high >= t + 1) {
                return t + 1;
            }
            t--;
        }
        return 1;
    }
}
