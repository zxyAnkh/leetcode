package com.zxyankh.leetcode.question.chinese;

/**
 * 如果二叉树每个节点都具有相同的值，那么该二叉树就是单值二叉树。
 * <p>
 * 只有给定的树是单值二叉树时，才返回 true；否则返回 false。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * <p>
 * 输入：[1,1,1,1,1,null,1]
 * 输出：true
 * 示例 2：
 * <p>
 * <p>
 * <p>
 * 输入：[2,2,2,5,2]
 * 输出：false
 *
 * @author ankh
 * @since 02.05.2019
 */
public class No965 {

    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isUnivalTree(root.left, root.val) && isUnivalTree(root.right, root.val);
    }

    public boolean isUnivalTree(TreeNode root, int x) {
        if (root == null) {
            return true;
        }
        if (root.val != x) {
            return false;
        }
        return isUnivalTree(root.left, x) && isUnivalTree(root.right, x);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
