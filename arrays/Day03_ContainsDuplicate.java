/*
 * 🏁 DSA RACE
 *
 * Day: 03
 * Track: Arrays
 * Lap: Contains Duplicate
 * Difficulty: Easy
 * Time: 05:32
 * Result: Time Limit Exceeded ⏱️
 *
 * Approach: Brute Force
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

class Solution {
    public boolean containsDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[j] == nums[i]) {
                    return true;
                }
            }
        }

        return false;
    }
}