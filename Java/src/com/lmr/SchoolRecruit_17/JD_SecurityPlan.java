package com.lmr.SchoolRecruit_17;

import java.util.Scanner;
import java.util.Stack;

public class JD_SecurityPlan {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int size = in.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(communications(arr));
        }
    }
 
    /**
     * �õ�Բ������һ��Ԫ�ص���������Ϊ����������������ʾԲ����
     *
     * <a href="/profile/547241" data-card-uid="547241" class="js-nc-card" target="_blank" style="color: #25bb9b">@param size
     * @param i
     * @return
     */
    public static int nextIndexInCircle(int size, int i) {
        return i < (size - 1) ? (i + 1) : 0;
    }
 
    /**
     * ����ջ����ջ����������ͬԪ��֮�乹�ɵĿɹ۲���ڶ���
     *
     * </a><a href="/profile/547241" data-card-uid="547241" class="js-nc-card" target="_blank" style="color: #25bb9b">@param n
     * @return
     */
    public static long getInternalSum(int n) {
        return n == 1 ? 0L : (long) n * (long) (n - 1) / 2L;
    }
 
    public static long communications(int[] arr) {
        if (arr == null || arr.length < 2) {
            return 0;
        }
        int size = arr.length;
        int maxIndex = 0;
        for (int i = 0; i < size; i++) {
            if (arr[maxIndex] < arr[i]) {
                maxIndex = i;
            }
        }
        int value = arr[maxIndex];  // ���ҵ������е�һ�����ֵ�����ܲ�ֹһ����
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(value)); // �Ȱ����ֵѹ�뵥��ջջ��
        long res = 0L;
        int index = nextIndexInCircle(size, maxIndex);
        while (index != maxIndex) {
            value = arr[index];
            while (!stack.isEmpty() && value > stack.peek().value) {    // ����һ�������Ԫ��
                int times = stack.pop().times;      // ջ��Ԫ�س�ջ�����õ���ջ��Ԫ�ص��ۼƸ���
                // ��ջ��ջ��Ԫ��֮�乹�ɿɹ۲���ڶ���C(times)2 = n*(n-1)/2����times==1ʱ�����ɵĿɹ۲���ڶ���Ϊ0
                // ��ջ��ջ��Ԫ�����������Ԫ���Լ�ʹ����ջ��Ԫ�������ɵĿɹ۲���ڶ���times * 2
                res += getInternalSum(times) + times * 2;
                System.out.println(times+" "+res);
            }
            if (!stack.isEmpty() && value == stack.peek().value) {  // �ۼ�ջ����������ͬԪ�ظ���
                stack.peek().times++;
            } else {    // stack.isEmpty() || value < stack.peek().value
                stack.push(new Pair(value));
            }
            index = nextIndexInCircle(size, index);
        }
        System.out.println(stack.size());
        while (!stack.isEmpty()) {  // ���е�Ԫ�ض��ѱ�����һ�飬����ջ����
            int times = stack.pop().times;
            res += getInternalSum(times);   // ��ͬԪ��֮�乹�ɵĿɹ۲���ڶ���
            if (!stack.isEmpty()) {
                res += times;   // ���������Ԫ�������ɵĿɹ۲���ڶ���   [�˴����]
                if (stack.size() >= 2) {    // �����沢����ջ�����ֵ
                    res += times;   // ��ջ�����ֵ�����ɵĿɹ۲���ڶ���
                } else {    // ����������ջ�����ֵ
                    res += stack.peek().times == 1 ? 0 : times; // ����������ջ�����ֵֻ��1������Ȼ���Ѿ�����[���]����һ�мӹ���
                }
            }
        }
        return res;
    }
 
    public static class Pair {
        public int value;
        public int times;
 
        public Pair(int value) {
            this.value = value;
            this.times = 1;
        }
    }

}
