package com.zxyankh.leetcode;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class HammingDistance {

    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

}
