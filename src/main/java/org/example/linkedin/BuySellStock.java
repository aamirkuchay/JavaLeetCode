package org.example.linkedin;

public class BuySellStock {
    public int maxProfit(int[] prices){
        if(prices == null || prices.length == 0){
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }else {
                int currentProfite = prices[i] - minPrice;
                if(currentProfite > maxProfit){
                    maxProfit = currentProfite;
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
      var  buySellStock = new BuySellStock();
        System.out.println(buySellStock.maxProfit(prices));
    }

}
