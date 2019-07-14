package com.zxyankh.leetcode.question.chinese;

/**
 * 给定一个只包含 '(' 和 ')' 的字符串，找出最长的包含有效括号的子串的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "(()"
 * 输出: 2
 * 解释: 最长有效括号子串为 "()"
 * 示例 2:
 * <p>
 * 输入: ")()())"
 * 输出: 4
 * 解释: 最长有效括号子串为 "()()"
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author zxyAnkh
 * @date 08.06.2019
 **/
public class No32 {

    public static void main(String[] args) {
        No32 no32 = new No32();
        System.out.println(no32.longestValidParentheses("(()"));
        System.out.println(no32.longestValidParentheses("()"));
        System.out.println(no32.longestValidParentheses(")()())"));
        System.out.println(no32.longestValidParentheses("()())"));
        System.out.println(no32.longestValidParentheses(")(()(()(((())(((((()()))((((()()(()()())())())()))()()()())(())()()(((()))))()((()))(((())()((()()())((())))(())))())((()())()()((()((())))))((()(((((()((()))(()()(())))((()))()))())"));
    }

    public int longestValidParentheses(String s) {
        return longestValidParentheses(s.toCharArray(), 0, s.length() - 1);
    }

    private int longestValidParentheses(char[] chars, int l, int r) {
        return 0;
    }
}
