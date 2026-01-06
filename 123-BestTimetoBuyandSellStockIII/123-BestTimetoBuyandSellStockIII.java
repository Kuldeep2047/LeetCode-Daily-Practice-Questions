// Last updated: 1/6/2026, 12:30:18 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int[][][] dp = new int[prices.length][3][3];
4        for(int a[][]: dp) {
5            for(int b[]: a) {
6                Arrays.fill(b, -1);
7            }
8        }
9        return answer(prices, 0,0,dp, 0);
10    }
11
12    public int answer(int[] prices, int idx, int state , int[][][] dp, int t){
13        if(idx == prices.length || t==2){
14            return 0;
15        }
16        int profit =0;
17
18        if(dp[idx][state][t] != -1){
19            return dp[idx][state][t];
20        }
21
22        if(state == 0 && t<2){
23            int buy = answer(prices, idx+1, 1, dp, t) - prices[idx];
24            int nobuy = answer(prices, idx+1, 0, dp, t);
25            profit = Math.max(buy, nobuy);
26        }
27        else if(state == 1 && t<2){
28            int sell = answer(prices, idx+1, 0, dp, t+1) + prices[idx];
29            int nosell = answer(prices, idx+1, 1, dp, t);
30            profit = Math.max(sell, nosell);
31        }
32        
33        return dp[idx][state][t] =  profit;
34    }
35}