package com.zxyankh.leetcode.question.chinese;

/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * <p>
 * 示例：
 * <p>
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * <p>
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 * <p>
 * 给定的 n 保证是有效的。
 * <p>
 * 进阶：
 * <p>
 * 你能尝试使用一趟扫描实现吗？
 *
 * @author ankh
 * @since 11.05.2019
 */
public class No19 {

    public static void main(String[] args) {
        No19 no19 = new No19();
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        no19.removeNthFromEnd(n1, 3);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode n1 = null;
        ListNode n2 = head;
        int step = 0;
        while (n2.next != null) {
            n2 = n2.next;
            step++;
            if (step >= n) {
                if (n1 == null) {
                    n1 = head;
                } else {
                    n1 = n1.next;
                }
            }
        }
        if (step > 0) {
            if (n1 == null) {
                return head.next;
            } else {
                n1.next = n1.next.next;
            }
            return head;
        } else {
            return null;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
