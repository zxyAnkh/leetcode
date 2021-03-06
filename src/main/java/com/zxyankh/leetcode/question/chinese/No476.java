package com.zxyankh.leetcode.question.chinese;

/**
 * 给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。
 * <p>
 * 注意:
 * <p>
 * 给定的整数保证在32位带符号整数的范围内。
 * 你可以假定二进制数不包含前导零位。
 * 示例 1:
 * <p>
 * 输入: 5
 * 输出: 2
 * 解释: 5的二进制表示为101（没有前导零位），其补数为010。所以你需要输出2。
 * 示例 2:
 * <p>
 * 输入: 1
 * 输出: 0
 * 解释: 1的二进制表示为1（没有前导零位），其补数为0。所以你需要输出0。
 *
 * @author ankh
 * @since 02.05.2019
 */
public class No476 {

    public static void main(String[] args) {
        No476 no476 = new No476();
        System.out.println(no476.findComplement(5));
    }

    public int findComplement(int num) {
        char[] chars = Integer.toBinaryString(num).toCharArray();
        StringBuilder stringBuilder = new StringBuilder(chars.length);
        for (char c : chars) {
            if (c == '1') {
                stringBuilder.append('0');
            } else {
                stringBuilder.append('1');
            }
        }
        return Integer.valueOf(stringBuilder.toString(), 2);
    }

}
