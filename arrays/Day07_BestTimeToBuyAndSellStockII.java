 /*
 * Day: 07
 * Track: Arrays
 * Lap: Best Time to Buy and Sell Stock II
 * Difficulty: Medium
 * Time: 12:13
 * Result: Accepted ✅
 *
 * Approach: One Pass
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */



class Solution {
    public int maxProfit(int[] prices) {
        int p=0, m=0, n=prices.length, l=0;
        for (int i=1; i<n; i++){
            if(prices[i]>=prices[i-1])
                m+=prices[i]-prices[i-1];
            else{
                continue;
            }
        }
        return m;
    }
}