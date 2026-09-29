/*
 * 🏎️ DSA RACE
 *
 * Day: 17
 * Track: Arrays
 * Lap: Largest Rectangle in Histogram
 * Difficulty: Hard
 * Time: 30:50
 * Result: Accepted ✅
 *
 * Approach: Monotonic Stack
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.*;

class Solution {
    public int largestRectangleArea(int[] heights) {

        int n = heights.length;
        int ans = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= n; i++) {

            int currentHeight = (i == n) ? 0 : heights[i];

            while (!stack.isEmpty() && heights[stack.peek()] > currentHeight) {

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