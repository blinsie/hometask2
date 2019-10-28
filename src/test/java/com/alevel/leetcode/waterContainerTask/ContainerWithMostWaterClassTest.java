package com.alevel.leetcode.waterContainerTask;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContainerWithMostWaterClassTest {

    ContainerWithMostWaterClass containerClass;
    private int[] firstArray;
    private int[] secondArray;
    private int[] thirdArray;

    @Before
    public void setUp(){
        firstArray = new int[]{7, 6, 8, 1, 3, 5, 7, 11, 1, 2};
        secondArray = new int[]{1, 1};
        thirdArray = new int[]{9, 6, -2, 2, 14};
        containerClass = new ContainerWithMostWaterClass();
    }

    @Test
    public void maxAreaOfCorrectFirstArray() {
        Assert.assertEquals(49, containerClass.maxArea(firstArray));
    }

    @Test
    public void maxAreaOfCorrectSecondArray() {
        Assert.assertEquals(1, containerClass.maxArea(secondArray));
    }

    @Test
    public void maxAreaOfIncorrectArray() {
        Assert.assertEquals(-1, containerClass.maxArea(thirdArray));
    }
}