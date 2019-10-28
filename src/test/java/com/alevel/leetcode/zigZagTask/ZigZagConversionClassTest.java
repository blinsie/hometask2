package com.alevel.leetcode.zigZagTask;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZigZagConversionClassTest {

    private ZigZagConversionClass zigZagClass;
    private static final String STRING = "PAYPALISHIRING";

    @Before
    public void setUp() {
        zigZagClass = new ZigZagConversionClass();
    }

    @Test
    public void convertInOneRow() {
        Assert.assertEquals("AB", zigZagClass.convert("AB", 1));
    }

    @Test
    public void convertEmptyString() {
        Assert.assertEquals("", zigZagClass.convert("", 2));
    }

    @Test
    public void convertIn3Rows() {
        Assert.assertEquals("PAHNAPLSIIGYIR", zigZagClass.convert(STRING, 3));
    }

    @Test
    public void convert4Rows() {
        Assert.assertEquals("PINALSIGYAHRPI", zigZagClass.convert(STRING, 4));
    }

    @Test
    public void convert5Rows() {
        Assert.assertEquals("PHASIYIRPLIGAN", zigZagClass.convert(STRING, 5));
    }
}