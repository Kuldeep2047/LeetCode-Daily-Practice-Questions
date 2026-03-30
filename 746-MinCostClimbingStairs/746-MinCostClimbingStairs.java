// Last updated: 3/30/2026, 11:13:31 AM
1class Solution {
2    public int minCostClimbingStairs(int[] cost) {
3        int[] dp = new int[cost.length];
4        Arrays.fill(dp ,-1);
5        int zero = helper(cost, dp, 0);
6        int one = helper(cost, dp ,1);
7        return Math.min(one , zero);
8    }
9    public int helper(int[] cost, int[] dp ,int idx){
10        if(idx >= cost.length){
11            return 0;
12        }
13        if(dp[idx] != -1){
14            return dp[idx];
15        }
16        int one = cost[idx] + helper(cost, dp ,idx+1);
17        int two = cost[idx] + helper(cost, dp ,idx+2);
18        return dp[idx] = Math.min(one ,two);
19    }
20}