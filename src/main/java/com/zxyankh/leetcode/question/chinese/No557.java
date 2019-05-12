package com.zxyankh.leetcode.question.chinese;

/**
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "Let's take LeetCode contest"
 * 输出: "s'teL ekat edoCteeL tsetnoc"
 * 注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 *
 * @author ankh
 * @since 03.05.2019
 */
public class No557 {

    public String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder(s.length());
        for (int i = 0; i < strings.length; i++) {
            char[] chs = strings[i].toCharArray();
            for (int j = chs.length - 1; j >= 0; j--) {
                stringBuilder.append(chs[j]);
            }
            if (i != strings.length - 1) {
                stringBuilder.append(' ');
            }
        }
        return stringBuilder.toString();
    }

}
