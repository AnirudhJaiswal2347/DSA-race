/*
 * 🏁 DSA RACE
 *
 * Day: 08
 * Track: Arrays
 * Lap: Rotate Array
 * LeetCode: #189
 * Time: 16:50
 * Difficulty: Medium
 * Result: Accepted ✅
 *
 * Approach: Three Reversals
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        if (n == 0) {
            return;
        }

        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}