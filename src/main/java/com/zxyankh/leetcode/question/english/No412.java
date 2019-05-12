package com.zxyankh.leetcode.question.english;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class No412 {

    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                result.add("No412");
            } else if (i % 5 == 0 && i % 3 != 0) {
                result.add("Buzz");
            } else if (i % 5 != 0 && i % 3 == 0) {
                result.add("Fizz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }

}
