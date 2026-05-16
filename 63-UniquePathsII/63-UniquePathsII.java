// Last updated: 5/16/2026, 9:46:34 PM
1class Solution {
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3        int m = obstacleGrid.length;
4        int n = obstacleGrid[0].length;
5
6        int[][] dp = new int[m][n];
7        return paths(0,0 ,m-1,n-1,dp,obstacleGrid);
8    }
9
10    public static int paths(int cr, int cc, int er ,int ec, int[][] dp, int[][] obstacle){
11        if(cr > er || cc > ec || obstacle[cr][cc] == 1){
12            return 0;
13        }
14        if(cr == er && cc == ec){
15            return 1;
16        }
17
18        
19
20        if(dp[cr][cc] != 0){
21            return dp[cr][cc];
22        }
23        
24        int a = paths(cr +1, cc, er, ec, dp, obstacle);
25        int b = paths(cr , cc+1, er, ec, dp, obstacle);
26
27        return dp[cr][cc] = a+b;
28        
29    }
30}