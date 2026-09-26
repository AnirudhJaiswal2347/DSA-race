/*
 * 🏎️ DSA RACE
 *
 * Day: 13
 * Track: Arrays
 * Lap: 3Sum
 * LeetCode: #15
 * Difficulty: Medium
 * Time: 23:15
 * Result: Accepted ✅
 *
 * Approach: Sorting + Two Pointers
 * Time Complexity: O(n²)
 * Space Complexity: O(1) extra space
 */

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length, sum = 0;
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            int fixed = nums[i];
            int left = i + 1;
            int right = nums.length - 1;

            if (i != 0 && nums[i] == nums[i - 1])
                continue;

            while (left < right) {
                sum = fixed + nums[left] + nums[right];

                if (sum < 0)
                    left++;
                else if (sum > 0)
                    right--;
                else {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    while (left < right && nums[left - 1] == nums[left])
                        left++;

                    while (left < right && nums[right + 1] == nums[right])
                        right--;
                }
            }
        }

        return ans;
    }
}