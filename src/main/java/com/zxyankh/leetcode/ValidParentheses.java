package com.zxyankh.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 *
 * @author ankh
 * @since 07.10.2018
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char cs = stack.pop();
                if ((cs == '(' && c != ')')
                        || (cs == '[' && c != ']')
                        || (cs == '{' && c != '}')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
