package com.zxyankh.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Every email consists of a local name and a domain name, separated by the @ sign.
 * <p>
 * For example, in alice@leetcode.com, alice is the local name, and leetcode.com is the domain name.
 * <p>
 * Besides lowercase letters, these emails may contain '.'s or '+'s.
 * <p>
 * If you add periods ('.') between some characters in the local name part of an email address,
 * mail sent there will be forwarded to the same address without dots in the local name.
 * For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.
 * (Note that this rule does not apply for domain names.)
 * <p>
 * If you add a plus ('+') in the local name, everything after the first plus sign will be ignored.
 * This allows certain emails to be filtered, for example m.y+name@email.com will be forwarded to my@email.com.
 * (Again, this rule does not apply for domain names.)
 * <p>
 * It is possible to use both of these rules at the same time.
 * <p>
 * Given a list of emails, we send one email to each address in the list.
 * How many different addresses actually receive mails?
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
 * Output: 2
 * Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= emails[i].length <= 100
 * 1 <= emails.length <= 100
 * Each emails[i] contains exactly one '@' character.
 * All local and domain names are non-empty.
 * Local names do not start with a '+' character.
 *
 * @author ankh
 * @since 15.04.2019
 */
public class UniqueEmailAddress {

    public static void main(String[] args) {
        UniqueEmailAddress t = new UniqueEmailAddress();
        t.numUniqueEmails(new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"});
    }

    public int numUniqueEmails(String[] emails) {
        Map<String, Set<String>> map = new HashMap<>();
        for (String email : emails) {
            char[] chars = email.toCharArray();
            StringBuilder stringBuilder = new StringBuilder();
            boolean plus = false;
            for (int i = 0; i < chars.length; i++) {
                if (plus && chars[i] != '@') {
                    continue;
                }
                if (chars[i] == '.') {
                    continue;
                }
                if (chars[i] == '+') {
                    if (plus) {
                        continue;
                    } else {
                        plus = true;
                        continue;
                    }
                }
                if (chars[i] == '@') {
                    Set<String> list = map.get(stringBuilder.toString());
                    if (list == null) {
                        list = new HashSet<>();
                    }
                    list.add(email.substring(i + 1));
                    map.put(stringBuilder.toString(), list);
                    break;
                }
                stringBuilder.append(chars[i]);
            }
        }
        int count = 0;
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            count += entry.getValue().size();
        }
        return count;
    }

}
