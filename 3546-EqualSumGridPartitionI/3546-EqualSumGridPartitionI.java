// Last updated: 3/25/2026, 10:49:44 AM
1class Solution {
2    public boolean canPartitionGrid(int[][] grid) {
3        return answer(grid);
4    }
5    public boolean answer(int[][] arr){
6        int n = arr.length;
7        int m = arr[0].length;
8        long sum =0;
9        int[] r= new int[n];
10        int[] c = new int[m];
11
12        for(int i=0 ;i<n ;i++){
13            for(int j=0 ;j<m ;j++){
14                sum += arr[i][j];
15
16                r[i] += arr[i][j];
17                c[j] += arr[i][j];
18            }
19        }
20
21        if(isAnswer(arr, r, sum) || isAnswer(arr, c, sum)){
22            return true;
23        }
24        return false;
25    }
26
27    public boolean isAnswer(int[][] arr, int[] a, long total){
28        long sum =0;
29        for(int i=0 ;i<a.length ;i++){
30            sum += a[i];
31            if(sum *2 == total){
32                return true;
33            }
34        }
35        return false;
36    }
37}