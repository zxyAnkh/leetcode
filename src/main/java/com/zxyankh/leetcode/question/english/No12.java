package com.zxyankh.leetcode.question.english;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class No12 {
    private final String[][] STRINGS = new String[][]{
            {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
            {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
            {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}, {"", "M", "MM", "MMM"}};

    public String intToRoman(int num) {
        String roman = "";
        roman += STRINGS[3][num / 1000 % 10];
        roman += STRINGS[2][num / 100 % 10];
        roman += STRINGS[1][num / 10 % 10];
        roman += STRINGS[0][num % 10];
        return roman;
    }

}
