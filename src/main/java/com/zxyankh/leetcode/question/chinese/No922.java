package com.zxyankh.leetcode.question.chinese;

/**
 * 给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
 * <p>
 * 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
 * <p>
 * 你可以返回任何满足上述条件的数组作为答案。
 * <p>
 * <p>
 * <p>
 * 示例：
 * <p>
 * 输入：[4,2,5,7]
 * 输出：[4,5,2,7]
 * 解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
 * <p>
 * <p>
 * 提示：
 * <p>
 * 2 <= A.length <= 20000
 * A.length % 2 == 0
 * 0 <= A[i] <= 1000
 *
 * @author ankh
 * @since 03.05.2019
 */
public class No922 {

    public static void main(String[] args) {
        No922 no922 = new No922();
        no922.sortArrayByParityII(new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8, 10});
    }

    public int[] sortArrayByParityII(int[] A) {
        int j = 1;
        for (int i = 0; i < A.length; i += 2) {
            if (A[i] % 2 != 0) {
                for (; j < A.length; j += 2) {
                    if (A[j] % 2 == 0) {
                        int tmp = A[i];
                        A[i] = A[j];
                        A[j] = tmp;
                        break;
                    }
                }
            }
        }
        return A;
    }

}
