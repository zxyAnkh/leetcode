package com.zxyankh.leetcode.question.english;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class No461 {

    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

}
