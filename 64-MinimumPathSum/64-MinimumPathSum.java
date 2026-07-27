// Last updated: 7/27/2026, 10:48:40 AM
1class Solution {
2    public int minFallingPathSum(int[][] matrix) {
3        return answer(matrix);
4    }
5
6    public int answer(int[][] arr){
7        int n = arr.length;
8        int m = arr[0].length;
9        int[][] ans = new int[n][m];
10        for(int i=0 ;i<m ;i++){
11            ans[0][i] = arr[0][i];
12        }
13
14        for(int i=1 ;i<n ;i++){
15            for(int j= 0 ;j<m ;j++){
16                int top = ans[i-1][j];
17                
18                int ld = Integer.MAX_VALUE;
19                if(i>0 && j>0){
20                    ld = ans[i-1][j-1];
21                }
22                int rd = Integer.MAX_VALUE;
23                if(j<m-1){
24                    rd = ans[i-1][j+1];
25                }
26
27                ans[i][j] = arr[i][j] + Math.min(top, Math.min(ld, rd));
28            }
29        }
30
31        int res = Integer.MAX_VALUE;
32        for(int i=0 ; i<m ;i++){
33            res = Math.min(res, ans[n-1][i]);
34        }
35        return res;
36    }
37}