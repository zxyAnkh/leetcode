package com.zxyankh.leetcode.question.english;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * You have a list of words and a pattern, and you want to know which words in words matches the pattern.
 * <p>
 * A word matches the pattern if there exists a permutation of letters p so that after replacing every letter x in the pattern with p(x), we get the desired word.
 * <p>
 * (Recall that a permutation of letters is a bijection from letters to letters: every letter maps to another letter, and no two letters map to the same letter.)
 * <p>
 * Return a list of the words in words that match the given pattern.
 * <p>
 * You may return the answer in any order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
 * Output: ["mee","aqq"]
 * Explanation: "mee" matches the pattern because there is a permutation {a -> m, b -> e, ...}.
 * "ccc" does not match the pattern because {a -> c, b -> c, ...} is not a permutation,
 * since a and b map to the same letter.
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= words.length <= 50
 * 1 <= pattern.length = words[i].length <= 20
 *
 * @author ankh
 * @since 25.04.2019
 */
public class No890 {

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>(words.length);
        char[] patterns = pattern.toCharArray();
        for (String word : words) {
            Map<Character, Character> map = new HashMap<>(word.length());
            Map<Character, Character> rmap = new HashMap<>(word.length());
            boolean flag = false;
            for (int i = 0; i < pattern.length(); i++) {
                char p = patterns[i];
                char w = word.charAt(i);
                Character pp = rmap.get(w);
                Character ww = map.get(p);
                if (pp == null && ww == null) {
                    map.put(p, w);
                    rmap.put(w, p);
                }
                if ((ww != null && ww != w) || (pp != null && pp != p)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                list.add(word);
            }
        }
        return list;
    }

}
