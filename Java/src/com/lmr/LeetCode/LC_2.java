package com.lmr.LeetCode;

/**
 * 2. 两数相加
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * <p>
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 * 示例 2：
 * <p>
 * 输入：l1 = [0], l2 = [0]
 * 输出：[0]
 * 示例 3：
 * <p>
 * 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * 输出：[8,9,9,9,0,0,0,1]
 *  
 * <p>
 * 提示：
 * <p>
 * 每个链表中的节点数在范围 [1, 100] 内
 * 0 <= Node.val <= 9
 * 题目数据保证列表表示的数字不含前导零
 */
public class LC_2 {

    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode tmp = head;
        int sum, t = 0;
        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val + t;
            tmp.next = new ListNode(sum % 10);
            tmp = tmp.next;
            t = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l2 != null) {
            l1 = l2;
        }
        if (t == 0) {
            tmp.next = l1;
        } else {
            while (l1 != null) {
                sum = l1.val + t;
                tmp.next = new ListNode(sum % 10);
                tmp = tmp.next;
                t = sum / 10;
                l1 = l1.next;
                if (t == 0) {
                    tmp.next = l1;
                    break;
                }
            }
            if (t > 0) {
                tmp.next = new ListNode(t);
            }
        }

        return head.next;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode list = new ListNode(0);
        ListNode head = list;

        int x, y, sum, flag;
        flag = 0;
        while (true) {
            x = l1.val;
            y = l2.val;
            sum = x + y + flag;
            if (sum >= 10) {
                sum = sum % 10;
                flag = 1;
            } else {
                flag = 0;
            }
            ListNode node = new ListNode(sum);
            list.next = node;
            list = node;
            if (l1.next == null || l2.next == null) {
                break;
            } else {
                l1 = l1.next;
                l2 = l2.next;
            }
        }

        while (l1.next != null) {
            l1 = l1.next;
            sum = l1.val + flag;
            if (sum >= 10) {
                sum = sum % 10;
                flag = 1;
            } else {
                flag = 0;
            }
            ListNode node = new ListNode(sum);
            list.next = node;
            list = node;
        }
        while (l2.next != null) {
            l2 = l2.next;
            sum = l2.val + flag;
            if (sum >= 10) {
                sum = sum % 10;
                flag = 1;
            } else {
                flag = 0;
            }
            ListNode node = new ListNode(sum);
            list.next = node;
            list = node;
        }

        if (flag == 1) {
            ListNode node = new ListNode(1);
            list.next = node;
        }

        return head.next;

    }

}
