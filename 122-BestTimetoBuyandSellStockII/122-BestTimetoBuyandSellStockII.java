// Last updated: 3/2/2026, 3:56:38 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        return buy_and_sell_stock(prices);
4    }
5    public static int buy_and_sell_stock(int[] prices){
6        int ans=0;
7        for(int i=0;i<prices.length-1;i++){
8            if(prices[i+1]>prices[i]){
9                ans += prices[i+1]-prices[i];
10            }
11        }
12        return ans;
13    }
14}