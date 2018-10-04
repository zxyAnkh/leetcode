package com.zxyankh.leetcode;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if (null == root)
            return null;
        else {
            TreeNode left = invertTree(root.left);
            TreeNode right = invertTree(root.right);
            root.left = right;
            root.right = left;
            return root;
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
