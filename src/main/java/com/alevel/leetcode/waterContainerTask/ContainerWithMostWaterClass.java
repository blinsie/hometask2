package com.alevel.leetcode.waterContainerTask;

public class ContainerWithMostWaterClass {

    /**
     * Given n non-negative integers a1, a2, ..., an , where each represents a
     * point at coordinate (i, ai). n vertical lines are drawn such that the two
     * endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together
     * with x-axis forms a container, such that the container contains the most water.
     * <p>
     * Note: You may not slant the container and n is at least 2.
     */

    public int maxArea(int[] height) {

        if (!checkArray(height)) {
            return -1;
        }

        int solution = 0;
        int tmpResult;
        int waterLevel;

        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                waterLevel = (height[i] >= height[j]) ? height[j] : height[i];
                tmpResult = waterLevel * (j - i);

                if (solution <= tmpResult) {
                    solution = tmpResult;
                }
            }
        }
        return solution;
    }

    private static boolean checkArray(int[] height) {
        for (int i = 0; i < height.length; i++) {
            if (height[i] < 0) {
                return false;
            }
        }
        return true;
    }

}
