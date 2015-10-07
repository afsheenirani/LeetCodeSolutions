package com.ai.medium;

public class BestTimeToBuySellStockI {
	public int maxProfit(int[] prices) {
        int min, max;
        
        if(prices.length <=1)
            return(0);
            
        min = prices[0];
        max = prices[0];
        int maxdiff = 0;
        for(int i=1; i < prices.length; i++) {
            if(prices[i] > max) {
                max = prices[i];
                if((max - min) > maxdiff)
                    maxdiff = max - min;
            }
            if(prices[i] < min) {
                min = prices[i];
                max = prices[i];
            }
        }
        return(maxdiff);
    }
}
