package com.alevel.leetcode.longestSubstringTask;

import org.junit.Assert;

public class LongestSubstringClassTest {

    private LongestSubstringClass longestSubstringClass;

    @org.junit.Before
    public void setUp() {
        longestSubstringClass = new LongestSubstringClass();
    }

    @org.junit.Test
    public void lengthOfEmptyStringLongestSubstring() {
        Assert.assertEquals(1, longestSubstringClass
                .lengthOfLongestSubstring(" "));
    }

    @org.junit.Test
    public void lengthOfLongestSubstringEqualToStringLength() {
        Assert.assertEquals(2, longestSubstringClass
                .lengthOfLongestSubstring("sd"));
    }

    @org.junit.Test
    public void lengthOfLongestSubstringInStringWithOrderedDuplicates() {
        Assert.assertEquals(3, longestSubstringClass
                .lengthOfLongestSubstring("pwwwwke"));
    }

    @org.junit.Test
    public void lengthOfLongestSubstringInStringWithDisorderedDuplicates() {
        Assert.assertEquals(4, longestSubstringClass
                .lengthOfLongestSubstring("jbpnbwwd"));
    }

    @org.junit.Test
    public void lengthOfLongestSubstringWithMarks() {
        Assert.assertEquals(5, longestSubstringClass
                .lengthOfLongestSubstring("a=a-aabbcdeaa54vv*&"));
    }

}