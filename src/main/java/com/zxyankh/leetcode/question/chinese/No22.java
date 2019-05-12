package com.zxyankh.leetcode.question.chinese;

import java.util.ArrayList;
import java.util.List;

/**
 * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
 * <p>
 * 例如，给出 n = 3，生成结果为：
 * <p>
 * [
 * "((()))",
 * "(()())",
 * "(())()",
 * "()(())",
 * "()()()"
 * ]
 *
 * @author ankh
 * @since 11.05.2019
 */
public class No22 {

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>((int) Math.pow(2, n));
        generate(list, "", n, n);
        return list;
    }

    private void generate(List<String> list, String str, int l, int r) {
        if (l == 0 && r == 0) {
            list.add(str);
            return;
        }
        if (l > 0) {
            generate(list, str + '(', l - 1, r);
        }
        if (r > l) {
            generate(list, str + ')', l, r - 1);
        }
    }

}
