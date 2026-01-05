// Last updated: 1/5/2026, 12:02:19 PM
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int[][] dp = new int[word1.length()][word2.length()];
4        for(int[] a : dp){
5            Arrays.fill(a, -1);
6        }
7        return answer(word1, word2, 0, 0, dp);
8    }
9
10    public static int answer(String s, String t, int i,int j, int[][] dp){
11		if(i == s.length()) {
12			return t.length() -j;
13		}
14		if(j == t.length()) {
15			return s.length() - i;
16		}
17
18        if(dp[i][j] != -1){
19            return dp[i][j];
20        } 
21        
22		
23		int ans =0;
24		if(s.charAt(i) == t.charAt(j)) {
25			ans = answer(s, t, i+1, j+1, dp);
26		}
27        else{
28			int Delete = answer(s, t, i+1, j, dp);
29			int Replace = answer(s, t, i+1, j+1, dp);
30			int Insert = answer(s, t, i, j+1, dp);
31			ans = 1+ Math.min(Delete,  Math.min(Replace, Insert));
32		}
33		return dp[i][j] = ans;
34	}
35}