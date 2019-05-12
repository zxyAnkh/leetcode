package com.zxyankh.leetcode.question.english;

/**
 * Given a string S that only contains "I" (increase) or "D" (decrease), let N = S.length.
 * <p>
 * Return any permutation A of [0, 1, ..., N] such that for all i = 0, ..., N-1:
 * <p>
 * If S[i] == "I", then A[i] < A[i+1]
 * If S[i] == "D", then A[i] > A[i+1]
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: "IDID"
 * Output: [0,4,1,3,2]
 * Example 2:
 * <p>
 * Input: "III"
 * Output: [0,1,2,3]
 * Example 3:
 * <p>
 * Input: "DDI"
 * Output: [3,2,0,1]
 *
 * @author ankh
 * @since 27.04.2019
 */
public class No942 {

    public int[] diStringMatch(String S) {
        int n = S.length();
        int[] a = new int[n + 1];
        int l = 0;
        int r = n;
        for (int i = 0; i < n; i++) {
            if (S.charAt(i) == 'I') {
                a[i] = l++;
            } else {
                a[i] = r--;
            }
        }
        a[n] = l;
        return a;
    }

}
