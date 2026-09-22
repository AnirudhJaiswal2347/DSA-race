/*
 * 🏎️ DSA RACE
 *
 * Day: 10
 * Track: Arrays
 * Lap: Product of Array Except Self
 * LeetCode: #238
 * Difficulty: Medium
 * Time: 37:36
 * Result: Accepted ✅
 *
 * Approach: Prefix + Suffix Products
 * Time Complexity: O(n)
 * Space Complexity: O(1) extra space
 */

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length, rp = 1;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++)
            ans[i] = 1;

        // Prefix product
        for (int i = 1; i < n; i++)
            ans[i] = ans[i - 1] * nums[i - 1];

        // Suffix product
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= rp;
            rp *= nums[i];
        }

        return ans;
    }
}