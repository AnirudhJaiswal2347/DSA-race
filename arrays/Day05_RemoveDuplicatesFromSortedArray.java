/*
 * 🏁 DSA RACE
 *
 * Day: 05
 * Track: Arrays
 * Lap: Remove Duplicates from Sorted Array
 * Difficulty: Easy
 * Time: 03:58
 * Result: Accepted ✅
 *
 * Approach: Two Pointers
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                k++;
            } 
            else if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}