package com.zxyankh.leetcode.question.english;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class No3 {

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        StringBuffer sb = new StringBuffer();
        for (char c : s.toCharArray()) {
            if (sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            } else {
                max = (max >= sb.length() ? max : sb.length());
                sb.delete(0, sb.indexOf(String.valueOf(c)) + 1);
                sb.append(c);
            }
        }
        return (max >= sb.length() ? max : sb.length());
    }

}
