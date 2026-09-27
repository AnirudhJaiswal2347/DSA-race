/*
 * 🏎️ DSA RACE
 *
 * Day: 15
 * Track: Arrays
 * Lap: First Missing Positive
 * Difficulty: Hard
 * Time: 49:01
 * Result: Accepted ✅
 *
 * Approach: Index Marking
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Replace irrelevant values
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n)
                nums[i] = n + 1;
        }

        // Step 2: Mark existing positive numbers
        for (int i = 0; i < n; i++) {
            int x = Math.abs(nums[i]);

            if (x <= n && x > 0) {
                nums[x - 1] = -Math.abs(nums[x - 1]);
            }
        }

        // Step 3: Find the first unmarked position
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                return i + 1;
            }
        }

        return n + 1;
    }
}