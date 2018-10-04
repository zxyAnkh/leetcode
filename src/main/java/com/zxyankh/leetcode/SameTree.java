package com.zxyankh.leetcode;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (null == p && null != q || null != p && null == q) {
            return false;
        } else if (null == p && null == q) {
            return true;
        } else {
            if (p.val != q.val) {
                return false;
            } else {
                boolean left = isSameTree(p.left, q.left);
                boolean right = isSameTree(p.right, q.right);
                return left && right;
            }
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
