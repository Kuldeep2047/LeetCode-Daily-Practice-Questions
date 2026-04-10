// Last updated: 4/10/2026, 10:41:48 AM
1class Solution {
2    int[][] dp;
3    public int longestCommonSubsequence(String text1, String text2) {
4        dp = new int[text1.length()][text2.length()];
5
6        for(int[] arr : dp){
7            Arrays.fill(arr, -1);
8        }
9        return answer(text1, text2, 0, 0);
10    }
11
12    public int answer(String s1, String s2, int i, int j){
13        if(i == s1.length() || j == s2.length() ){
14            return 0;
15        }
16        if(dp[i][j] != -1){
17            return dp[i][j];
18        }
19
20        int ans =0;
21        if(s1.charAt(i) == s2.charAt(j)){
22            ans = 1 + answer(s1, s2, i+1, j+1);
23        }
24        else{
25            int a = answer(s1, s2, i+1, j);
26            int b = answer(s1, s2, i, j+1);
27            ans = Math.max(a,b);
28        }
29        return dp[i][j] =  ans;
30    }
31}