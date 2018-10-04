package com.zxyankh.leetcode;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class TwoSumII {

    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[]{0, 0};
        for (int i = 0; i < numbers.length; i++) {
            if (i != 0) {
                if (numbers[i] == numbers[i - 1])
                    continue;
            }
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    result[0] = i + 1;
                    result[1] = j + 1;
                    break;
                }
            }
            if (result[0] != 0 && result[1] != 0) {
                break;
            }
        }
        return result;
    }

}
