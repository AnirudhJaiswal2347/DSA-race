/*
 * 🏁 DSA RACE
 *
 * Day: 02
 * Track: Arrays
 * Lap: Best Time to Buy and Sell Stock
 * Difficulty: Easy
 * Time: 12:12
 * Result: Accepted ✅
 *
 * Approach: One Pass
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int lowestPrice = 0;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] <= prices[lowestPrice]) {
                lowestPrice = i;
            }
            else {
                profit = prices[i] - prices[lowestPrice];

                if (profit >= maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}