// Last updated: 3/14/2026, 10:43:10 AM
1class Solution {
2    public int numIslands(char[][] grid) {
3        int ans =0;
4        int n = grid.length;
5        int m = grid[0].length;
6        for(int i=0 ;i<n ;i++){
7            for(int j=0 ;j<m ;j++){
8                if(grid[i][j] == '1'){
9                    answer(grid, i,j);
10                    ans++;
11                }
12                
13            }
14        }
15        return ans;
16    }
17    public void answer(char[][] grid, int r, int c){
18        if(r<0 || c<0 || r>=grid.length || c>= grid[0].length || grid[r][c] != '1'){
19            return;
20        }
21
22        grid[r][c] = '*';
23        answer(grid ,r+1,c);
24        answer(grid, r,c-1);
25        answer(grid,r-1,c);
26        answer(grid ,r,c+1);
27    }
28}