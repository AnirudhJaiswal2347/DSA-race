/*
 * 🏎️ DSA RACE
 *
 * Day: 14
 * Track: Arrays
 * Lap: Trapping Rain Water
 * Difficulty: Hard
 * Time: 39:37
 * Result: Accepted ✅
 *
 * Approach: Two Pointers
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left = 0, right = n - 1, ans = 0;
        int maxL = 0, maxR = 0;
        int area = 0;

        while (left < right) {
            if (height[left] <= height[right]) {
                maxL = Math.max(maxL, height[left]);
                area = maxL - height[left];
                left++;
            } else {
                maxR = Math.max(maxR, height[right]);
                area = maxR - height[right];
                right--;
            }

            ans += area;
        }

        return ans;
    }
}