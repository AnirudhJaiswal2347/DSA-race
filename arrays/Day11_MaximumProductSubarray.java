/*
 * 🏎️ DSA RACE
 *
 * Day: 11
 * Track: Arrays
 * Lap: Maximum Product Subarray
 * LeetCode: #152
 * Difficulty: Medium
 * Time: 32:51
 * Result: Accepted ✅
 *
 * Approach: Dynamic Programming / Kadane-style
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int cmax = 1, cmin = 1, ans = nums[0];

        for (int i = 0; i < n; i++) {
            int a = nums[i];
            int b = cmax * nums[i];
            int c = cmin * nums[i];

            int newcmax = Math.max(a, Math.max(b, c));
            int newcmin = Math.min(a, Math.min(b, c));

            cmax = newcmax;
            cmin = newcmin;

            if (cmax >= ans)
                ans = cmax;
        }

        return ans;
    }
}