package com.zxyankh.leetcode;

/**
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A,
 * followed by all the odd elements of A.
 * <p>
 * You may return any answer array that satisfies this condition.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [3,1,2,4]
 * Output: [2,4,3,1]
 * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= A.length <= 5000
 * 0 <= A[i] <= 5000
 *
 * @author ankh
 * @since 18.04.2019
 */
public class SortArrayByParity {

    public int[] sortArrayByParity(int[] A) {
        int i = 0;
        int j = A.length - 1;
        int[] result = new int[A.length];
        for (int k : A) {
            if (k % 2 == 0) {
                result[i++] = k;
            } else {
                result[j--] = k;
            }
        }
        return result;
    }

}
