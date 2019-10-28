package com.alevel.leetcode.longestSubstringTask;

public class LongestSubstringClass {

    /**
        Given a string, find the length of the longest substring without repeating characters.

        Example 1:
        Input: "abcabcbb"
        Output: 3
        Explanation: The answer is "abc", with the length of 3.

        Example 2:
        Input: "bbbbb"
        Output: 1
        Explanation: The answer is "b", with the length of 1.

        Example 3:
        Input: "pwwkew"
        Output: 3
        Explanation: The answer is "wke", with the length of 3.

        Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
     */

    public int lengthOfLongestSubstring(String s) {
        String subString = "";
        String tmpResult = "";
        String ch;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                ch = String.valueOf(s.charAt(j));

                if (!tmpResult.contains(ch)) {
                    tmpResult += ch;
                } else {
                   break;
                }

                if (subString.length() < tmpResult.length()) {
                    subString = tmpResult;
                }
            }
            tmpResult = "";
        }

        return subString.length();
    }
}
