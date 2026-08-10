// Last updated: 8/10/2026, 10:09:19 AM
1class Solution {
2    Boolean[] dp;
3    public boolean winnerSquareGame(int n) {
4        dp = new Boolean[n+1];
5        return answer(n);
6    }
7    public boolean answer(int n){
8        if(n <= 0){
9            return false;
10        }
11        if(dp[n] != null){
12            return dp[n];
13        }
14
15        for(int i=1 ;i*i<=n ;i++){
16            boolean ans = answer(n - i*i);
17            if(ans == false){
18                return dp[n] = true;
19            }
20        }
21        return dp[n] = false;
22    }
23}