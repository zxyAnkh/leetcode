package com.zxyankh.leetcode.question.english;

import java.util.Arrays;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class No242 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        Arrays.sort(cs);
        Arrays.sort(ct);
        for (int i = 0, j = 0; i < cs.length; i++, j++) {
            if (cs[i] != ct[j]) {
                return false;
            }
        }
        return true;
    }

}
