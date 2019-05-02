package com.zxyankh.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个 N 叉树，返回其节点值的前序遍历。
 * <p>
 * 例如，给定一个 3叉树 :
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 返回其前序遍历: [1,3,5,6,2,4]。
 *
 * @author ankh
 * @since 02.05.2019
 */
public class No589 {

    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        preorder(root, list);
        return list;
    }

    public void preorder(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }

        list.add(root.val);
        if (root.children != null && !root.children.isEmpty()) {
            for (Node child : root.children) {
                preorder(child, list);
            }
        }
    }


    class Node {
        int val;
        List<Node> children;

        Node() {

        }

        Node(int val, List<Node> children) {
            this.val = val;
            this.children = children;
        }
    }

}
