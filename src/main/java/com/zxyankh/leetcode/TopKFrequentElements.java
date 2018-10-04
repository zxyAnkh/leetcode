package com.zxyankh.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class TopKFrequentElements {

    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> result = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i).intValue() + 1);
            } else {
                map.put(i, 1);
            }
        }
        while (k > 0) {
            int kk = 0;
            int max = 0;
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Integer key = (Integer) entry.getKey();
                Integer val = (Integer) entry.getValue();
                if (val >= max) {
                    kk = key;
                    max = val;
                }
            }
            map.remove(kk);
            result.add(kk);
            k--;
        }
        return result;
    }

}
