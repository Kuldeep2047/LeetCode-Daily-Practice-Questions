// Last updated: 1/5/2026, 12:47:11 PM
1class Solution {
2    Boolean[][] dp;
3    public boolean isInterleave(String s1, String s2, String s3) {
4        dp = new Boolean[s1.length()+1][s2.length()+1];
5       
6        return answer(s1, s2, s3, 0, 0, 0);
7    }
8    public boolean answer(String s1, String s2, String s3, int i, int j, int k){
9        if(k == s3.length()){
10            return i == s1.length() && j==s2.length();
11        }
12
13        if(dp[i][j] != null){
14            return dp[i][j];
15        }
16
17        boolean ans = false;
18
19        if(i<s1.length() && s1.charAt(i) == s3.charAt(k)){
20            ans = answer(s1,s2,s3, i+1, j, k+1);
21        }
22        if(!ans && j<s2.length() && s2.charAt(j) == s3.charAt(k)){
23            ans = answer(s1, s2, s3, i, j+1 ,k+1);
24        }
25
26        return dp[i][j] = ans;
27        
28        
29    }
30}