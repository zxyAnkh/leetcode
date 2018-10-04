package com.zxyankh.leetcode;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class FindTheDifference {

    public char findTheDifference(String s, String t) {
        char ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            ans ^= t.charAt(i);
        }
        return ans;
    }

}
