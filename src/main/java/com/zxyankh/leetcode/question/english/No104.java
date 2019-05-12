package com.zxyankh.leetcode.question.english;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class No104 {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return left > right ? left + 1 : right + 1;
        }
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
