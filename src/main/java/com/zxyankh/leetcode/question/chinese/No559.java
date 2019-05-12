package com.zxyankh.leetcode.question.chinese;

import java.util.List;

/**
 * 给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。键盘如下图所示。
 * <p>
 * <p>
 * <p>
 * American keyboard
 * <p>
 * <p>
 * <p>
 * 示例：
 * <p>
 * 输入: ["Hello", "Alaska", "Dad", "Peace"]
 * 输出: ["Alaska", "Dad"]
 *
 * @author ankh
 * @since 02.05.2019
 */
public class No559 {

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.children == null || root.children.isEmpty()) {
            return 1;
        }
        int max = 0;
        for (Node node : root.children) {
            int m = maxDepth(node, 1);
            if (m > max) {
                max = m;
            }
        }
        return max;
    }

    public int maxDepth(Node root, int current) {
        if (root == null) {
            return current;
        }
        if (root.children == null || root.children.isEmpty()) {
            return current + 1;
        }
        int max = 0;
        for (Node node : root.children) {
            int m = maxDepth(node, current);
            if (m > max) {
                max = m;
            }
        }
        return current + max;
    }


    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

}
