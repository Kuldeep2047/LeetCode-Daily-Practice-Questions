// Last updated: 8/7/2026, 1:15:22 PM
1class Solution {
2    public int getMaximumGold(int[][] grid) {
3        int ans = 0;
4        int n = grid.length;
5        int m = grid[0].length;
6        for(int i=0 ;i<n ;i++){
7            for(int j=0 ;j<m ;j++){
8                ans = Math.max(ans, answer(grid, i, j));
9            }
10        }
11        return ans;
12
13    }
14    public int answer(int[][] arr, int i, int j){
15        if(i<0 || j<0 || i>=arr.length || j>=arr[0].length || arr[i][j] == 0){
16            return 0;
17        }
18        int gold = arr[i][j];
19        arr[i][j] = 0;
20
21        int a = answer(arr , i-1, j);
22        int b = answer(arr, i, j+1);
23        int c = answer(arr, i+1, j);
24        int d = answer(arr, i, j-1);
25
26        arr[i][j] = gold;
27
28        return arr[i][j] + Math.max(Math.max(a,b), Math.max(c,d));
29    }
30}