package com.zxyankh.leetcode.question.english;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class No357 {

    public int countNumbersWithUniqueDigits(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            int val = 9;
            for (int j = 1; j <= i; j++) {
                val *= (9 - j + 2);
            }
            result += val;
        }
        return result / 10 + 1;
    }

}
