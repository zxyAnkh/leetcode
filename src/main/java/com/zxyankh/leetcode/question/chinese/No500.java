package com.zxyankh.leetcode.question.chinese;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个 N 叉树，找到其最大深度。
 * <p>
 * 最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。
 * <p>
 * 例如，给定一个 3叉树 :
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 我们应返回其最大深度，3。
 * <p>
 * 说明:
 * <p>
 * 树的深度不会超过 1000。
 * 树的节点总不会超过 5000。
 *
 * @author ankh
 * @since 02.05.2019
 */
public class No500 {

    private static final byte[] bytes = new byte[]{1, 2, 2, 1, 0, 1, 1, 1, 0, 1, 1, 1, 2, 2, 0, 0, 0, 0, 1, 0, 0, 2, 0, 2, 0, 2};

    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>(words.length);
        int index;
        int line;
        boolean flag;
        for (int i = 0; i < words.length; i++) {
            index = Character.toLowerCase(words[i].charAt(0)) - 97;
            line = bytes[index];
            flag = false;
            for (char c : words[i].toCharArray()) {
                index = Character.toLowerCase(c) - 97;
                if (bytes[index] != line) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                list.add(words[i]);
            }
        }
        return list.toArray(new String[list.size()]);
    }

}
