// Last updated: 6/14/2026, 10:24:48 AM
1class Solution {
2    public int countNegatives(int[][] grid) {
3        return answer(grid);
4    }
5
6    public int answer(int[][] grid){
7        int n=grid.length;
8        int m=grid[0].length;
9        
10        int i=0;
11        int j=m-1;
12        int ans=0;
13        while(i<n && j>=0){
14            if(grid[i][j]<0){
15                j--;
16                ans+=n-i;
17            }
18            else{
19                i++;
20            }
21        }
22        return ans;
23    }
24}