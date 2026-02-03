// Last updated: 2/3/2026, 10:02:43 PM
1class Solution {
2    int ans = Integer.MAX_VALUE;
3    public int minimizeTheDifference(int[][] mat, int target) {
4        
5        int maxSum = target + 70 * mat.length; 
6        int[][] dp = new int[mat.length + 1][maxSum + 1];
7
8        for (int[] row : dp) {
9            Arrays.fill(row, -1);
10        }
11
12        answer(mat, target, 0, 0,dp);
13        return ans;
14    }
15    
16    public void answer(int[][] mat, int target, int r, int sum, int[][] dp){
17        if (sum > target + 70 * mat.length){
18            return;
19        }
20
21        if(r == mat.length){
22            ans = Math.min(ans, Math.abs(sum - target));
23            return;
24        }
25        if (dp[r][sum] != -1){
26            return;
27        }
28        dp[r][sum] = 1;
29        // int sum =0;
30        for(int col =0 ;col<mat[0].length ;col++){
31            answer(mat, target, r+1, sum + mat[r][col], dp);
32        }
33    }
34}