package com.zxyankh.leetcode.competition;

/**
 * 给出由小写字母组成的字符串 S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。
 * <p>
 * 在 S 上反复执行重复项删除操作，直到无法继续删除。
 * <p>
 * 在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。
 * <p>
 * <p>
 * <p>
 * 示例：
 * <p>
 * 输入："abbaca"
 * 输出："ca"
 * 解释：
 * 例如，在 "abbaca" 中，我们可以删除 "bb" 由于两字母相邻且相同，这是此时唯一可以执行删除操作的重复项。
 * 之后我们得到字符串 "aaca"，其中又只有 "aa" 可以执行重复项删除操作，所以最后的字符串为 "ca"。
 *
 * @author ankh
 * @since 19.05.2019
 */
public class No5064 {

    public static void main(String[] args) {
        No5064 no5064 = new No5064();
        no5064.removeDuplicates("abbaca");
    }

    public String removeDuplicates(String S) {
        StringBuilder stringBuilder = new StringBuilder(S);
        while (true) {
            boolean flag = false;
            for (int i = 0; i < stringBuilder.length() - 1; i++) {
                if (stringBuilder.charAt(i) == stringBuilder.charAt(i + 1)) {
                    stringBuilder.deleteCharAt(i);
                    stringBuilder.deleteCharAt(i);
                    i = -1;
                    flag = true;
                }
            }
            if (!flag) {
                return stringBuilder.toString();
            }
        }
    }

}
