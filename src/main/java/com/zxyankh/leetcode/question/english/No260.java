package com.zxyankh.leetcode.question.english;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class No260 {

    public int[] singleNumber(int[] nums) {
        int re = 0;
        for (int num : nums) {
            re ^= num;
        }
        int n = re & (~(re - 1));
        int a = 0;
        int b = 0;
        for (int num : nums) {
            if ((n & num) != 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[]{a, b};
    }

}
