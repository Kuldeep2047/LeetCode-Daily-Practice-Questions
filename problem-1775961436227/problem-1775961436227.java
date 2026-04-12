// Last updated: 4/12/2026, 8:07:16 AM
1class Solution {
2    public int[] findDegrees(int[][] matrix) {
3        return answer(matrix);
4    }
5    public int[] answer(int[][] arr){
6        int n = arr.length;
7        int[] ans = new int[n];
8
9        for(int i=0 ;i<n ;i++){
10            int deg =0;
11            for(int j=0 ;j<n ;j++){
12                deg += arr[i][j];
13            }
14
15            ans[i] = deg;
16        }
17
18        return ans;
19    }
20}