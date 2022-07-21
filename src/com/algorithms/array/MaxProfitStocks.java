package com.algorithms.array;

public class MaxProfitStocks {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int min = prices[0];
        int max = prices[1];

        int tempMin = min;
        int tempMax = max;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < tempMin) {
                tempMin = prices[i];
            } else if (prices[i] > tempMax) {
                tempMax = prices[i];
            }

        }

        return max - min;
    }
}
