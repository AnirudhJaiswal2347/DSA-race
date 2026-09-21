/*
 * 🏁 DSA RACE
 *
 * Day: 09
 * Track: Arrays
 * Lap: Single Number
 * LeetCode: #136
 * Difficulty: Easy
 * Time: 04:52
 * Result: Accepted ✅
 *
 * Approach: Bitwise XOR
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            result ^= nums[i];
        }

        return result;
    }
}
