package com.zxyankh.leetcode.question.english;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class No5 {

    public String longestPalindrome(String s) {
        if (s.isEmpty()) {
            return s;
        }
        StringBuilder result = new StringBuilder();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            sb.replace(0, sb.length(), getPalindromic(s, i, i));
            if (sb.length() >= result.length())
                result.replace(0, result.length(), sb.toString());

            sb.replace(0, sb.length(), getPalindromic(s, i, i + 1));
            if (sb.length() >= result.length())
                result.replace(0, result.length(), sb.toString());
        }

        return result.toString();
    }

    private String getPalindromic(String str, int l, int r) {
        while (l >= 0 && r < str.length()) {
            if (str.charAt(l) != str.charAt(r)) {
                break;
            } else {
                l--;
                r++;
            }
        }
        return str.substring(l + 1, r);
    }

}
