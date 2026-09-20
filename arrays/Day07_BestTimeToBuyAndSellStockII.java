 /*
 * Day: 07
 * Track: Arrays
 * Lap: Best Time to Buy and Sell Stock II
 * Difficulty: Medium
 * Time: 12:13
 * Result: Accepted ✅
 *
 * Approach: Greedy
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int maxProfit(int[] prices) {
        int m=0, n=prices.length;
        for (int i=1; i<n; i++){
            if(prices[i]>=prices[i-1])
                m+=prices[i]-prices[i-1];
        }
        return m;
    }
}