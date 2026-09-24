// Last updated: 9/24/2026, 2:21:34 PM
1class Solution {
2    public int uniquePaths(int m, int n) {
3        int[][] dp = new int[m][n];
4        for(int[] a :dp){
5            Arrays.fill(a,-1);
6        }
7        return answer(0,0,m-1,n-1, dp);
8    }
9    public int answer(int cr, int cc, int n, int m, int[][] dp){
10        if(cr == n && cc == m){
11            return 1;
12        }
13        if(cr >n || cc>m){
14            return 0;
15        }
16
17        if(dp[cr][cc] != -1){
18            return dp[cr][cc];
19        }
20
21        int left = answer(cr, cc+1, n, m, dp);
22        int down = answer(cr+1, cc, n, m, dp);
23
24        return dp[cr][cc] = left + down;
25    }
26}