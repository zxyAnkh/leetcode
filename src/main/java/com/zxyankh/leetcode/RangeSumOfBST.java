package com.zxyankh.leetcode;

/**
 * Given the root node of a binary search tree,
 * return the sum of values of all nodes with value between L and R (inclusive).
 * <p>
 * The binary search tree is guaranteed to have unique values.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
 * Output: 32
 * Example 2:
 * <p>
 * Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
 * Output: 23
 * <p>
 * <p>
 * Note:
 * <p>
 * The number of nodes in the tree is at most 10000.
 * The final answer is guaranteed to be less than 2^31.
 *
 * @author ankh
 * @since 14.04.2019
 */
public class RangeSumOfBST {

    public static void main(String[] args) {

    }

    public static int rangeSumBST(TreeNode root, int L, int R) {
        int sum = 0;
        if (root == null) {
            return sum;
        }
        if (root.val <= R && root.val >= L) {
            sum += root.val;
        }
        if (root.left != null) {
            if (root.left.val >= L) {
                sum += rangeSumBST(root.left, L, R);
            } else {
                sum += rangeSumBST(root.left.right, L, R);
            }
        }
        if (root.right != null) {
            if (root.right.val <= R) {
                sum += rangeSumBST(root.right, L, R);
            } else {
                sum += rangeSumBST(root.right.left, L, R);
            }
        }
        return sum;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }
    }

}
