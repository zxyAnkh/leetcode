package com.zxyankh.leetcode.question.english;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class No169 {

    public int majorityElement(int[] nums) {
        int result = 0;
        int length = nums.length, time = (int) Math.ceil(length / 2d);
        if (length == 1) {
            return nums[0];
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i).intValue() + 1);
                if (map.get(i).intValue() >= time) {
                    result = i;
                    break;
                }
            } else {
                map.put(i, 1);
            }
        }
        return result;
    }

}
