package com.zxyankh.leetcode.question.chinese;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 给出一个链表，每 k 个节点一组进行翻转，并返回翻转后的链表。
 * <p>
 * k 是一个正整数，它的值小于或等于链表的长度。如果节点总数不是 k 的整数倍，那么将最后剩余节点保持原有顺序。
 * <p>
 * 示例 :
 * <p>
 * 给定这个链表：1->2->3->4->5
 * <p>
 * 当 k = 2 时，应当返回: 2->1->4->3->5
 * <p>
 * 当 k = 3 时，应当返回: 3->2->1->4->5
 * <p>
 * 说明 :
 * <p>
 * 你的算法只能使用常数的额外空间。
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 * @author ankh
 * @since 14.05.2019
 */
public class No25 {

    public static void main(String[] args) {
        No25 no25 = new No25();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
//        l2.next = l3;
//        l3.next = l4;
//        l4.next = l5;

        no25.reverseKGroup(l1, 2);
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null) {
            return head;
        }
        Deque<ListNode> stack = new ArrayDeque<>(k);
        ListNode pre = null;
        ListNode h = null;
        while (head != null) {
            int count = 0;
            while (count < k && head != null) {
                count++;
                stack.addLast(head);
                head = head.next;
            }
            if (count == k) {
                if (pre == null) {
                    pre = stack.removeLast();
                    h = pre;
                }
                while (!stack.isEmpty()) {
                    pre.next = stack.removeLast();
                    pre = pre.next;
                }
            } else {
                if (pre == null) {
                    pre = stack.pop();
                    h = pre;
                }
                while (!stack.isEmpty()) {
                    pre.next = stack.pop();
                    pre = pre.next;
                }
            }
            pre.next = null;
        }
        return h;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
