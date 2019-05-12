package com.zxyankh.leetcode.question.english;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class No13 {

    private final String[][] STRINGS = new String[][]{
            {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
            {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
            {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}, {"", "M", "MM", "MMM"}};

    public int romanToInt(String roman) {
        int num = 0;
        for (int i = 3; i >= 1; i--) {
            if (roman.startsWith(STRINGS[3][i])) {
                num = 1000 * i;
                roman = roman.substring(STRINGS[3][i].length());
                break;
            }
        }
        for (int i = 9; i >= 1; i--) {
            if (roman.startsWith(STRINGS[2][i])) {
                num += 100 * i;
                roman = roman.substring(STRINGS[2][i].length());
                break;
            }
        }
        for (int i = 9; i >= 1; i--) {
            if (roman.startsWith(STRINGS[1][i])) {
                num += 10 * i;
                roman = roman.substring(STRINGS[1][i].length());
                break;
            }
        }
        for (int i = 9; i >= 1; i--) {
            if (roman.startsWith(STRINGS[0][i])) {
                num += 1 * i;
                roman = roman.substring(STRINGS[0][i].length());
                break;
            }
        }
        return num;
    }

}
