/*
 * 🏎️ DSA RACE
 *
 * Day: 18
 * Track: Arrays
 * Lap: Maximal Rectangle
 * Difficulty: Hard
 * Time: 27:38
 * Result: Accepted ✅
 *
 * Approach: Histogram + Monotonic Stack
 * Time Complexity: O(rows × cols)
 * Space Complexity: O(cols)
 */

import java.util.*;

class Solution {
    public int maximalRectangle(char[][] matrix) {

        if (matrix.length == 0)
            return 0;

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] heights = new int[cols];
        int ans = 0;

        for (int i = 0; i < rows; i++) {

            // Build histogram for the current row
            for (int j = 0; j < cols; j++) {

                if (matrix[i][j] == '1')
                    heights[j]++;
                else
                    heights[j] = 0;
            }

            // Find largest rectangle in the histogram
            ans = Math.max(ans, largestRectangleArea(heights));
        }

        return ans;
    }

    public int largestRectangleArea(int[] heights) {

        int n = heights.length;
        int ans = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= n; i++) {

            int currentHeight = (i == n) ? 0 : heights[i];

            while (!stack.isEmpty() &&
                   heights[stack.peek()] > currentHeight) {

                int h = heights[stack.pop()];

                int left = stack.isEmpty() ? -1 : stack.peek();

                int width = i - left - 1;

                int area = h * width;

                ans = Math.max(ans, area);
            }

            stack.push(i);
        }

        return ans;
    }
}