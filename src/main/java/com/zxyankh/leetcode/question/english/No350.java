package com.zxyankh.leetcode.question.english;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class No350 {

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> result = new ArrayList<Integer>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            int n1 = nums1[i];
            int n2 = nums2[j];
            if (n1 == n2) {
                result.add(n1);
                i++;
                j++;
            } else if (n1 < n2)
                i++;
            else
                j++;
        }
        int[] ret = new int[result.size()];
        int k = 0;
        for (int num : result)
            ret[k++] = num;
        return ret;
    }

}
