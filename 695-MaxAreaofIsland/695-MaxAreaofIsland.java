// Last updated: 3/16/2026, 10:54:40 AM
1class Solution {
2    public int maxAreaOfIsland(int[][] grid) {
3        int ans =0;
4        int n = grid.length;
5        int m = grid[0].length;
6        for(int i=0 ;i<n ;i++){
7            for(int j=0 ;j<m ;j++){
8                if(grid[i][j] == 1){
9                    ans = Math.max(ans, answer(grid, i, j));
10                }
11            }
12        }
13        return ans;
14    }
15    public int answer(int[][] grid, int cr, int cc){
16        if(cr <0 || cc<0 || cr >= grid.length || cc>=grid[0].length || grid[cr][cc] != 1){
17            return 0;
18        }
19        grid[cr][cc] = 5;
20        int a = answer(grid, cr+1, cc);
21        int b = answer(grid, cr, cc+1);
22        int c = answer(grid, cr-1, cc);
23        int d = answer(grid, cr, cc-1);
24
25        return a +b + c+d +1;
26    }
27}