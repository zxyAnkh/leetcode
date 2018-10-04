package com.zxyankh.leetcode;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty())
            return true;
        boolean flag = false;
        for (char c : s.toCharArray()) {
            if (-1 == t.indexOf(c)) {
                flag = false;
                break;
            } else {
                t = t.substring(t.indexOf(c) + 1);
                flag = true;
            }
        }
        return flag;
    }

}
