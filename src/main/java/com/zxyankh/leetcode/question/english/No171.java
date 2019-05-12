package com.zxyankh.leetcode.question.english;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class No171 {

    public int titleToNumber(String s) {
        if (s.length() == 1) {
            return (int) s.charAt(0) - 64;
        }
        int result = 0;
        for (int i = 0, j = s.length() - 1; j >= 0; i++, j--) {
            result += (int) Math.pow(26, i) * (s.charAt(j) - 'A' + 1);
        }
        return result;
    }

}
