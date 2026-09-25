/*
 * 🏎️ DSA RACE
 *
 * Day: 12
 * Track: Arrays
 * Lap: Container With Most Water
 * LeetCode: #11
 * Difficulty: Medium
 * Time: 22:15
 * Result: Accepted ✅
 *
 * Approach: Two Pointers
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n - 1;
        int ans = 0;

        while (l < r) {
            int width = r - l;
            int h = Math.min(height[l], height[r]);
            int area = width * h;

            if (area > ans)
                ans = area;

            if (height[l] > height[r])
                r--;
            else
                l++;
        }

        return ans;
    }
}