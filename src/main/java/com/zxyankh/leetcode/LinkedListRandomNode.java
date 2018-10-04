package com.zxyankh.leetcode;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class LinkedListRandomNode {

    private ListNode head = null;
    private int len = 0;

    /**
     * @param head The linked list's head. Note that the head is guaranteed to be
     *             not null, so it contains at least one node.
     */
    public LinkedListRandomNode(ListNode head) {
        this.head = head;
        if (null != head) {
            this.len++;
        }
        while (null != head.next) {
            this.len++;
            head = head.next;
        }
    }

    /**
     * Returns a random node's value.
     */
    public int getRandom() {
        int random = (int) (Math.random() * this.len + 1);
        int result = 0;
        ListNode ln = this.head;
        for (int index = 1; index <= random; index++) {
            result = ln.val;
            ln = ln.next;
        }
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
