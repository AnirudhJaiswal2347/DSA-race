/*
 * 🏎️ DSA RACE
 *
 * Day: 16
 * Track: Arrays
 * Lap: Sliding Window Maximum
 * Difficulty: Hard
 * Time: 32:00
 * Result: Working Attempt ⚠️
 *
 * Approach: Max + Index Tracking with Rescanning
 * Time Complexity: O(n²) worst case
 * Space Complexity: O(n)
 *
 * Note:
 * This is a learning implementation using the custom approach.
 * Planned revision: Monotonic Deque for O(n) solution.
 */

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];

        int max = Integer.MIN_VALUE;
        int l = -1;
        int j = 0;

        int left = 0;
        int right = k - 1;

        for (int i = 0; i < n; ) {

            // Scan the current window
            if (i >= left && i <= right) {

                if (nums[i] >= max) {
                    max = nums[i];
                    l = i;
                }

                // Reached the end of current window
                if (i == right) {

                    ans[j] = max;
                    j++;

                    // Move window one step
                    left++;
                    right++;

                    // No more windows
                    if (right >= n)
                        break;

                    // Current maximum has left the window
                    if (l < left) {

                        // Reset and rescan the new window
                        max = Integer.MIN_VALUE;
                        l = -1;
                        i = left;

                    } else {

                        // Maximum is still inside
                        // Only the newly added element needs checking
                        i = right;
                    }

                } else {
                    i++;
                }
            }
        }

        return ans;
    }
}