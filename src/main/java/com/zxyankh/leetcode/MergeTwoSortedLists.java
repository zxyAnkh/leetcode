package com.zxyankh.leetcode;

/**
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 *
 * @author ankh
 * @since 07.10.2018
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l2 == null) {
            return l1;
        } else if (l1 == null) {
            return l2;
        }
        ListNode l;
        ListNode listNode;
        if (l1.val < l2.val) {
            listNode = new ListNode(l1.val);
            l1 = l1.next;
        } else {
            listNode = new ListNode(l2.val);
            l2 = l2.next;
        }
        l = listNode;
        while (l1 != null || l2 != null) {
            if (l2 == null) {
                listNode.next = new ListNode(l1.val);
                l1 = l1.next;
            } else if (l1 == null) {
                listNode.next = new ListNode(l2.val);
                l2 = l2.next;
            } else if (l1.val < l2.val) {
                listNode.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                listNode.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            listNode = listNode.next;
        }
        return l;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
