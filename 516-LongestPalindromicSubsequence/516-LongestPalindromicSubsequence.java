// Last updated: 3/23/2026, 4:41:32 PM
1class Solution {
2    public int longestPalindromeSubseq(String s) {
3        int n = s.length();
4        int[][] dp = new int[n][n];
5
6        return answer(s, 0, s.length()-1, dp);
7    }
8
9    public static int answer(String s, int i, int j, int[][] dp){
10        if(i == j){
11            return 1;
12        }
13        if(i>=j){
14            return 0;
15        }
16
17        if(dp[i][j] != 0){
18            return dp[i][j];
19        }
20        
21
22        if(s.charAt(i) == s.charAt(j)){
23            dp[i][j] =  2+ answer(s, i+1 ,j-1, dp);
24        }else{
25            dp[i][j] =  Math.max(answer(s, i+1, j, dp) , answer(s, i,j-1, dp));
26        }
27        
28
29        return dp[i][j];
30    }
31}