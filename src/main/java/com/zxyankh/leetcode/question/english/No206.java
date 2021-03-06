package com.zxyankh.leetcode.question.english;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class No206 {

    public ListNode reverseList(ListNode head) {
        if (null == head || null == head.next)
            return head;
        ListNode next = head.next;
        ListNode result = reverseList(next);
        next.next = head;
        head.next = null;
        return result;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
