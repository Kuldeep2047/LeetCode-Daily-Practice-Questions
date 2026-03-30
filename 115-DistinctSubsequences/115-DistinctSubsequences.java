// Last updated: 3/30/2026, 11:59:40 AM
1class Solution {
2    public int numDistinct(String s, String t) {
3        int[][] dp = new int[s.length()+1][t.length()+1];
4		for(int[] a:dp) {
5			Arrays.fill(a, -1);
6		}
7	    return Coin_Change(s,t,0,0,dp);
8    }
9    public static int Coin_Change(String s,String t,int i,int j,int[][] dp) {
10		if(j==t.length()) {
11			return 1;
12		}
13		if(i==s.length()) {
14			return 0;
15		}
16		if(dp[i][j] != -1) {
17			return dp[i][j];
18		}
19		
20		int inc =0;
21        int exc =0;
22		if(s.charAt(i) == t.charAt(j)) {
23			inc = Coin_Change(s, t, i+1, j+1, dp);
24		}
25		exc = Coin_Change(s, t, i+1 ,j, dp);
26        
27		return dp[i][j] = inc + exc;
28	}
29}