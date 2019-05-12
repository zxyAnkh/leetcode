package com.zxyankh.leetcode.question.chinese;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 * <p>
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * <p>
 * <p>
 * <p>
 * 示例:
 * <p>
 * 输入："23"
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * 说明:
 * 尽管上面的答案是按字典序排列的，但是你可以任意选择答案输出的顺序。
 *
 * @author ankh
 * @since 06.05.2019
 */
public class No17 {

    private static final char[][] CHARS = {
            {
                    'a', 'b', 'c'
            },

            {
                    'd', 'e', 'f'
            },

            {
                    'g', 'h', 'i'
            },

            {
                    'j', 'k', 'l'
            },

            {
                    'm', 'n', 'o'
            },

            {
                    'p', 'q', 'r', 's'
            },

            {
                    't', 'u', 'v'
            },

            {
                    'w', 'x', 'y', 'z'
            }
    };

    public static void main(String[] args) {
        No17 no17 = new No17();
        no17.letterCombinations("23");
    }

    public List<String> letterCombinations(String digits) {
        return letterCombinations(digits.toCharArray(), 0, new ArrayList<>());
    }

    public List<String> letterCombinations(char[] chars, int index, List<String> list) {
        if (index == chars.length) {
            return list;
        }
        int j = (int) chars[index] - 50;
        int size = list.size();
        for (char cc : CHARS[j]) {
            if (size == 0) {
                list.add(String.valueOf(cc));
            } else {
                for (int i = 0; i < size; i++) {
                    list.add(list.get(i) + cc);
                }
            }
        }
        for (int i = 0; i < size; i++) {
            list.remove(0);
        }
        return letterCombinations(chars, index + 1, list);
    }
}
