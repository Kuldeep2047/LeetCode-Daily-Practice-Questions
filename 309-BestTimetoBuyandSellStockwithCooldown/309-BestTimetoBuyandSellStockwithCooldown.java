// Last updated: 1/6/2026, 11:51:21 AM
1class Solution {
2    public int maxProfit(int[] prices) {
3        if(prices.length == 1){
4            return 0;
5        }
6        int[][] dp = new int[prices.length][3];
7        for(int[] a: dp){
8            Arrays.fill(a, -1);
9        }
10        return answer(prices, 0, 0, dp);
11        // return answer(prices);
12    }
13    public int answer(int[] prices, int idx, int state , int[][] dp){
14        if(idx >= prices.length ){
15            return 0;
16        }
17        int profit =0;
18
19        if(dp[idx][state] != -1){
20            return dp[idx][state];
21        }
22
23        if(state == 0){
24            int buy = answer(prices, idx+1, 1, dp) - prices[idx];
25            int nobuy = answer(prices, idx+1, 0, dp);
26            profit = Math.max(buy, nobuy);
27        }
28        else if(state == 1){
29            int sell = answer(prices, idx+1, 2, dp) + prices[idx];
30            int nosell = answer(prices, idx+1, 1, dp);
31            profit = Math.max(sell, nosell);
32        }
33        else{
34            profit = answer(prices, idx+1, 0, dp);
35        }
36        return dp[idx][state] =  profit;
37    }
38
39    // public int answer(int[] arr){
40    //     int n = arr.length;
41    //     int buy = -arr[0];
42    //     int sell = 0;
43    //     int cool =0;
44    //     for(int i=1 ;i<n ;i++){
45    //         int prebuy = buy;
46    //         int precool = cool;
47    //         int presell = sell;
48
49    //         buy = Math.max(prebuy, precool-arr[i]);
50    //         sell = prebuy + arr[i];
51    //         cool = Math.max(precool, presell);
52    //     }
53    //     return Math.max(sell, cool);
54    // }
55}