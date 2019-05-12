package com.zxyankh.leetcode.question.english;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class No343 {

    public int integerBreak(int n) {
        if (n == 2)
            return 1;
        if (n == 3)
            return 2;
        int x = 0, y = 0;
        while (n > 3) {
            if (n - 3 >= 3) {
                y++;
                n -= 3;
            } else if (n - 2 > 0) {
                x++;
                n -= 2;
            }
        }
        if (n == 3) {
            y++;
        } else if (n == 2) {
            x++;
        }
        return (int) (Math.pow(2, x) * Math.pow(3, y));
    }

}
