package com.github.nadal.algo.easy.dp;

/**
 * Author: lukong
 * Date: 2019/1/7
 * Description:
 */
public class BuyAndShellStock {
    /**
     * Say you have an array for which the ith element is the price of a given stock on day i.
     * If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock),
     * design an algorithm to find the maximum profit.
     * Note that you cannot sell a stock before you buy one.
     *
     * Example 1:
     *  Input: [7,1,5,3,6,4]
     *  Output: 5
     *  Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
     *  Not 7-1 = 6, as selling price needs to be larger than buying price.
     *
     * 解题思路：
     *  寻找左边的值最小的元素，每次在左边找一个较小的元素就把它当成目前最小的元素，然后后面的元素与该最小元素的差值就是当前的收益，
     *  然后与历史最大收益取最大值，便可以得到总体的收益最大值
     * */

    public int maxProfit(int[] prices) {
        int min = 0;
        int maxProfit = 0;
        int length = prices.length;
        for(int i=0; i<length; i++) {
            min = prices[i]<prices[min] ? i:min;
            maxProfit = Math.max(prices[i]-prices[min], maxProfit);
        }
        return maxProfit;
    }
}
