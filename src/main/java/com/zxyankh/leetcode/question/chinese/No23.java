package com.zxyankh.leetcode.question.chinese;

/**
 * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * [
 * 1->4->5,
 * 1->3->4,
 * 2->6
 * ]
 * 输出: 1->1->2->3->4->4->5->6
 *
 * @author ankh
 * @since 13.05.2019
 */
public class No23 {

    public static void main(String[] args) {
        No23 no23 = new No23();
        ListNode[] listNodes = new ListNode[3];
        ListNode ll1 = new ListNode(1);
        ListNode ll2 = new ListNode(4);
        ll1.next = ll2;
        ListNode ll3 = new ListNode(5);
        ll2.next = ll3;

        ListNode l21 = new ListNode(1);
        ListNode l22 = new ListNode(3);
        l21.next = l22;
        ListNode l23 = new ListNode(4);
        l22.next = l23;

        ListNode l31 = new ListNode(2);
        ListNode l32 = new ListNode(6);
        l31.next = l32;

        listNodes[0] = ll1;
        listNodes[1] = l21;
        listNodes[2] = l31;

        no23.mergeKLists(listNodes);
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        if (lists.length == 1) {
            return lists[0];
        }
        if (lists.length == 2) {
            return merge(lists[0], lists[1]);
        }
        ListNode[] nodes;
        if (lists.length % 2 == 0) {
            nodes = new ListNode[lists.length / 2];
        } else {
            nodes = new ListNode[lists.length / 2 + 1];
        }
        int j = 0;
        for (int i = 0; i < lists.length; i += 2) {
            if (i == lists.length - 1) {
                nodes[j++] = merge(lists[i], null);
            } else {
                nodes[j++] = merge(lists[i], lists[i + 1]);
            }
        }
        return mergeKLists(nodes);
    }

    private ListNode merge(ListNode ln1, ListNode ln2) {
        if (ln1 == null) {
            return ln2;
        }
        if (ln2 == null) {
            return ln1;
        }
        ListNode head;
        if (ln1.val > ln2.val) {
            head = new ListNode(ln2.val);
            ln2 = ln2.next;
        } else {
            head = new ListNode(ln1.val);
            ln1 = ln1.next;
        }
        ListNode node = head;
        while (ln1 != null && ln2 != null) {
            if (ln1.val > ln2.val) {
                node.next = new ListNode(ln2.val);
                ln2 = ln2.next;
            } else {
                node.next = new ListNode(ln1.val);
                ln1 = ln1.next;
            }
            node = node.next;
        }
        if (ln1 == null) {
            node.next = ln2;
        } else {
            node.next = ln1;
        }
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
