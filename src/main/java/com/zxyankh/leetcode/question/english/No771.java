package com.zxyankh.leetcode.question.english;

/**
 * @author ankh
 * @since 07.10.2018
 */
public class No771 {

    public int numJewelsInStones(String j, String s) {
        int num = 0;
        if (j.length() == 0 || s.length() == 0) {
            return num;
        }
        for (char c : s.toCharArray()) {
            if (j.indexOf(c) != -1) {
                num++;
            }
        }
        return num;
    }

}
