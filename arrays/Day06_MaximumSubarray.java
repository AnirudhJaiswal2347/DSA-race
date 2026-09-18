/*
 * 🏁 DSA RACE
 *
 * Day: 06
 * Track: Arrays
 * Lap: Maximum Subarray
 * Difficulty: Medium
 * Time: 31:25
 * Result: Accepted ✅
 *
 * Approach: Kadane's Algorithm
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int n = nums.length;
        int tsum = nums[0];

        for (int i = 1; i < n; i++) {
            if (sum + nums[i] >= nums[i]) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }

            if (sum > tsum) {
                tsum = sum;
            }
        }

        return tsum;
    }
}