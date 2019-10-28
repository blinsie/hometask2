package com.alevel.leetcode.zigZagTask;

import java.util.Arrays;

public class ZigZagConversionClass {

    /**
     * The string "PAYPALISHIRING" is written in a zigzag pattern on a given
     * number of rows like this: (you may want to display this pattern in a
     * fixed font for better legibility)
     *
     * P   A   H   N
     * A P L S I I G
     * Y   I   R
     * And then read line by line: "PAHNAPLSIIGYIR"
     *
     * Write the code that will take a string and make this conversion given
     * a number of rows:
     *
     * string convert(string s, int numRows);
     *
     * Example 1:
     * Input: s = "PAYPALISHIRING", numRows = 3
     * Output: "PAHNAPLSIIGYIR"
     *
     * Example 2:
     * Input: s = "PAYPALISHIRING", numRows = 4
     * Output: "PINALSIGYAHRPI"
     * Explanation:
     *
     * P     I    N
     * A   L S  I G
     * Y A   H R
     * P     I
     */

    public String convert(String s, int numRows) {

        if ((numRows == 1) || (numRows == s.length())) {
            return s;
        }

        String solution = "";
        String[] strings = new String[numRows + 1];
        Arrays.fill(strings, "");
        int i = 0;
        int cursor = 0;
        boolean isReverse = false;

        while (i < s.length()) {
            strings[cursor] += s.charAt(i);
            cursor = isReverse ? (cursor - 1) : (cursor + 1);

            if (cursor == numRows - 1) {
                isReverse = true;
            }
            if (cursor == 0) {
                isReverse = false;
            }
            i++;
        }

        for (int x = 0; x < strings.length; x++) {
            solution += strings[x];
        }
        return solution;
    }

}
