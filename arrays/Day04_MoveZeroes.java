/*
 * 🏁 DSA RACE
 *
 * Day: 04
 * Track: Arrays
 * Lap: Move Zeroes
 * Difficulty: Easy
 * Time: 05:43
 * Result: Accepted ✅
 *
 * Approach: Two Pointers
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertPos] = nums[i];
                insertPos++;
            }
        }

        // Fill the remaining positions with zeroes
        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }
    }
}