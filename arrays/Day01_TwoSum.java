/*
 * 🏁 DSA RACE
 *
 * Day: 01
 * Track: Arrays
 * Lap: Two Sum
 * Difficulty: Easy
 * Time: 09:52
 * Result: Accepted ✅
 *
 * Approach: Brute Force
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                if (nums[i]+nums[j]==target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}