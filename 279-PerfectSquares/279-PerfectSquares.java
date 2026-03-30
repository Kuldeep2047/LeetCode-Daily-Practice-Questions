// Last updated: 3/30/2026, 11:00:38 AM
1class Solution {
2    public int numSquares(int n) {
3        int[] dp = new int[n+1];
4        Arrays.fill(dp ,-1);
5        return answer(n, dp);
6    }
7    public int answer(int n, int[] dp){
8        if(n <= 0){
9            return 0;
10        }
11        
12        if(dp[n] != -1){
13            return dp[n];
14        }
15
16        int ans = Integer.MAX_VALUE;
17        for(int i=1 ; i*i<=n ;i++){
18            int c = 1 + answer(n - i*i, dp);
19            ans = Math.min(ans, c);
20        }
21
22        return dp[n] = ans;
23    }
24}