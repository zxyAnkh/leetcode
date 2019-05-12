package com.zxyankh.leetcode.question.english;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class No387 {

    public int firstUniqueChar(String s) {
        int result = -1;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                result = s.indexOf(c);
                break;
            }
        }
        return result;
    }

}
