package com.zxyankh.leetcode;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class ZigZagConversion {

    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows == 0) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= numRows; i++) {
            int j = i - 1, k = 0;
            while (j < s.length()) {
                sb.append(s.charAt(j));
                j += k++ % 2 == 0 || i == 1 || i == numRows ? 2 * numRows - 2 * (i < numRows ? i : 1) : 2 * i - 2;
            }
        }
        return sb.toString();
    }

}
