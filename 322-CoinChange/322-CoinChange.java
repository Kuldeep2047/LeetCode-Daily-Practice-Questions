// Last updated: 8/7/2026, 9:48:37 AM
1class Solution {
2    int[][] dp ;
3    public int coinChange(int[] coins, int amount) {
4        int n = coins.length;
5        dp = new int[n][amount+1];
6        for(int[] a : dp){
7            Arrays.fill(a, -1);
8        }
9        int ans= answer(coins, amount, 0);
10        if(ans == Integer.MAX_VALUE){
11            return -1;
12        }
13        return ans;
14    }
15
16    public int answer(int[] coins, int amount, int idx){
17        if(amount == 0){
18            return 0;
19        }
20        if(amount < 0){
21            return Integer.MAX_VALUE;
22        }
23
24        if(dp[idx][amount] != -1){
25            return dp[idx][amount];
26        }
27        int ans = Integer.MAX_VALUE;
28        for(int i = idx ; i<coins.length ;i++){
29            if(coins[i] <= amount){
30                int res = answer(coins, amount - coins[i], i);
31                if(res != Integer.MAX_VALUE){
32                    ans = Math.min(ans, res+1);
33                }
34            }
35        }
36
37        return dp[idx][amount] = ans;
38    }
39
40
41   
42}