
/**
 * 121. Best Time to Buy and Sell Stock

You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 * @author jskr4
 */
public class BestTimeToBuyAndSellStock {
    
    public static void main(String[] args) {
        
     int [] prices = {7,1,5,3,6,4};   

     System.out.println(maxProfit(prices));

    }

    public static  int maxProfit(int[] prices) {

        // Get the length of the prices array
        int n = prices.length;

        // Initialize variables to keep track of the minimum price and maximum profit
        int min = Integer.MAX_VALUE; // Initialize min to the maximum possible integer value
        int maxValue = 0; // Initialize maxValue to 0, as we start with no profit

        // Iterate through the prices array to find the maximum profit
        for (int i = 0; i < n; i++) {
            // Update the minimum price encountered so far
            min = Math.min(prices[i], min);

            // Update the maximum profit if the current profit is greater
            maxValue = Math.max(prices[i] - min, maxValue);
        }

        return maxValue; // Return the maximum profit
    }

    
}
