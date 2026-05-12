package org.example.FONGG;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {

        // Store the minimum price seen so far
        int min = prices[0];
        // Store the maximum profit
        int profit = 0;
        // Loop through all stock prices
        for (int i = 0; i < prices.length; i++) {
            // If current price is smaller than minimum price
            if (prices[i] < min) {

                // Update minimum price
                min = prices[i];
            }
            // Calculate current profit:
            // current selling price - minimum buying price
            // Math.max keeps the highest profit found so far
            profit = Math.max(profit, prices[i] - min);
        }

        // Return maximum profit
        return profit;
    }

    public static void main(String[] args) {
        int[] num = {7, 1, 5, 4, 3};
        BestTimeToBuyAndSellStock s = new BestTimeToBuyAndSellStock();
        int i = s.maxProfit(num);
        System.out.println(i);
    }

}
