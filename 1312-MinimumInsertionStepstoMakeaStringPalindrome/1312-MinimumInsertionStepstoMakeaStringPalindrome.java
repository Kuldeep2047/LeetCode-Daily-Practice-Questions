// Last updated: 3/25/2026, 12:13:22 PM
1class Solution {
2    public int minInsertions(String s) {
3        int[][] dp = new int[s.length()][s.length()];
4        for(int[] a : dp){
5            Arrays.fill(a, -1);
6        }
7
8        return answer(s, 0, s.length()-1, dp);
9    }
10
11    public int answer(String s, int i, int j, int[][] dp){
12        if(i>=j){
13            return 0;
14        }
15        if(dp[i][j] != -1){
16            return dp[i][j];
17        }
18
19        int count =0;
20        if(s.charAt(i) == s.charAt(j)){
21            count = answer(s, i+1, j-1, dp);
22        }else{
23            int a = answer(s, i+1, j, dp);
24            int b = answer(s, i, j-1, dp);
25            count = 1+ Math.min(a,b);
26        }
27        return dp[i][j] = count;
28    }
29}