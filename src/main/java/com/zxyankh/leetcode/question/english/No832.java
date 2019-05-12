package com.zxyankh.leetcode.question.english;

/**
 * Given a binary matrix A, we want to flip the image horizontally,
 * then invert it, and return the resulting image.
 * <p>
 * To flip an image horizontally means that each row of the image is reversed.
 * For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
 * <p>
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
 * For example, inverting [0, 1, 1] results in [1, 0, 0].
 * <p>
 * Example 1:
 * <p>
 * Input: [[1,1,0],[1,0,1],[0,0,0]]
 * Output: [[1,0,0],[0,1,0],[1,1,1]]
 * Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
 * Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 * Example 2:
 * <p>
 * Input: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 * Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
 * Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * Notes:
 * <p>
 * 1 <= A.length = A[0].length <= 20
 * 0 <= A[i][j] <= 1
 *
 * @author ankh
 * @since 20.04.2019
 */
public class No832 {

    public int[][] flipAndInvertImage(int[][] A) {
        int k = A.length % 2 == 0 ? A.length / 2 : A.length / 2 + 1;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < k; j++) {
                int tmp = A[i][j];
                if (tmp == 0) {
                    tmp = 1;
                } else if (tmp == 1) {
                    tmp = 0;
                }
                if (A[i][A.length - j - 1] == 0) {
                    A[i][j] = 1;
                } else if (A[i][A.length - j - 1] == 1) {
                    A[i][j] = 0;
                }
                A[i][A.length - j - 1] = tmp;
            }
        }
        return A;
    }

}
