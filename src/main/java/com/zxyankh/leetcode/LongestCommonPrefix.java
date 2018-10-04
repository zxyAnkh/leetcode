package com.zxyankh.leetcode;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        }
        String commonPrefix = "";
        int length = strs[0].length();
        for (String str : strs) {
            if (str.length() < length) {
                length = str.length();
            }
        }
        for (int i = 0; i < length; i++) {
            char c = strs[0].charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != c) {
                    return commonPrefix;
                }
            }
            commonPrefix += c;
        }
        return commonPrefix;
    }

}
