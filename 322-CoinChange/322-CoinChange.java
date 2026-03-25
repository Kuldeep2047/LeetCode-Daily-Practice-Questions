// Last updated: 3/25/2026, 11:20:54 AM
1class Solution {
2    public int coinChange(int[] coins, int amount) {
3        int n = coins.length;
4        int[][] dp = new int[n][amount+1];
5        for(int[] a : dp){
6            Arrays.fill(a, -1);
7        }
8        int count =  answer(coins, amount, 0, dp);
9        if(count == Integer.MAX_VALUE){
10            return -1;
11        }
12        return count;
13    }
14    public int answer(int[] coins, int amount, int idx, int[][] dp){
15        if(amount == 0){
16            return 0;
17        }
18        if(amount < 0){
19            return Integer.MAX_VALUE;
20        }
21        if(dp[idx][amount] != -1){
22            return dp[idx][amount];
23        }
24        int ans =Integer.MAX_VALUE;
25
26        for(int i= idx ; i<coins.length ;i++){
27            if(coins[i] <= amount){
28                int res = answer(coins, amount - coins[i], i, dp);
29                if(res != Integer.MAX_VALUE){
30                    ans = Math.min(ans, res + 1);
31                }
32            }
33        }
34        return dp[idx][amount] =  ans;
35
36        
37
38
39    }
40}