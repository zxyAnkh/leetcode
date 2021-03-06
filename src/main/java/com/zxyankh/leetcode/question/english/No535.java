package com.zxyankh.leetcode.question.english;

import java.util.Base64;

/**
 * Note: This is a companion problem to the System Design problem: Design TinyURL.
 * TinyURL is a URL shortening service where you enter a URL
 * such as https://leetcode.com/problems/design-tinyurl and it returns a short URL such as http://tinyurl.com/4e9iAk.
 * <p>
 * Design the encode and decode methods for the TinyURL service.
 * There is no restriction on how your encode/decode algorithm should work.
 * You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.
 *
 * @author ankh
 * @since 14.04.2019
 */
public class No535 {

    /**
     * Encodes a URL to a shortened URL.
     */
    public String encode(String longUrl) {
        return Base64.getEncoder().encodeToString(longUrl.getBytes());
    }

    /**
     * Decodes a shortened URL to its original URL.
     */
    public String decode(String shortUrl) {
        return new String(Base64.getDecoder().decode(shortUrl.getBytes()));
    }

}
