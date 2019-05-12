package com.zxyankh.leetcode.question.english;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class No383 {

    public boolean canConstruct(String ransomNote, String magazine) {
        char[] ransom = ransomNote.toCharArray();
        char[] maga = magazine.toCharArray();
        for (char c : ransom) {
            boolean flag = false;
            for (int i = 0; i < maga.length; i++) {
                if (maga[i] == c) {
                    flag = true;
                    maga[i] = ' ';
                    break;
                }
            }
            if (!flag)
                return false;
        }
        return true;
    }

}
