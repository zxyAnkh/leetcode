package com.zxyankh.leetcode.question.english;

import java.util.ArrayList;
import java.util.List;

/**
 * We run a preorder depth first search on the root of a binary tree.
 * <p>
 * At each node in this traversal, we output D dashes (where D is the depth of this node),
 * then we output the value of this node.  (If the depth of a node is D, the depth of its immediate child is D+1.
 * The depth of the root node is 0.)
 * <p>
 * If a node has only one child, that child is guaranteed to be the left child.
 * <p>
 * Given the output S of this traversal, recover the tree and return its root.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * <p>
 * Input: "1-2--3--4-5--6--7"
 * Output: [1,2,5,3,4,6,7]
 * Example 2:
 * <p>
 * <p>
 * <p>
 * Input: "1-2--3---4-5--6---7"
 * Output: [1,2,5,3,null,6,null,4,null,7]
 * <p>
 * <p>
 * Example 3:
 * <p>
 * <p>
 * <p>
 * Input: "1-401--349---90--88"
 * Output: [1,401,null,349,88,90]
 * <p>
 * <p>
 * Note:
 * <p>
 * The number of nodes in the original tree is between 1 and 1000.
 * Each node will have a value between 1 and 10^9.
 * <p>
 * {@see https://leetcode.com/problems/recover-a-tree-from-preorder-traversal/}
 *
 * @author ankh
 * @since 15.04.2019
 */
public class No1028 {


    public static void main(String[] args) {
        No1028 t = new No1028();
//        t.recoverFromPreorder("1-2--3--4-5--6--7");
        t.recoverFromPreorder("1-2--3---4-5--6---7");
        t.recoverFromPreorder("1-401--349---90--88");
    }

    public TreeNode recoverFromPreorder(String S) {
        if (S == null || S.length() == 0) {
            return null;
        }
        List<TreeNode> list = new ArrayList<>(1000);
        for (int i = 0; i < 1000; i++) {
            list.add(null);
        }
        int depth = 0;
        StringBuilder val = new StringBuilder();
        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '-') {
                depth++;
            } else {
                val.append(chars[i]);
                if (i == chars.length - 1 || chars[i + 1] == '-') {
                    TreeNode node = new TreeNode(Integer.parseInt(val.toString()));
                    if (depth == 0) {
                        list.set(0, node);
                    } else {
                        int rootIndex = depth / 2 + 1;
                        if (rootIndex == 1) {
                            rootIndex = 0;
                        }
                        TreeNode rootNode = list.get(rootIndex);
                        if (rootNode == null) {
                            rootIndex -= 1;
                            rootNode = list.get(rootIndex);
                        }
                        if (rootNode.left == null) {
                            rootNode.left = node;
                            list.set(2 * rootIndex + 1, node);
                        } else {
                            rootNode.right = node;
                            list.set(2 * rootIndex + 2, node);
                        }
                    }
                    val.delete(0, val.length());
                    depth = 0;
                }
            }
        }
        return list.get(0);
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
