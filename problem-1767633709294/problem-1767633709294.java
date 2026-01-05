// Last updated: 1/5/2026, 10:51:49 PM
1class Solution {
2    public long maxMatrixSum(int[][] matrix) {
3        return answer(matrix);
4    }
5    public long answer(int[][] arr){
6        int n = arr.length;
7        int m = arr[0].length;
8
9        long sum=0;
10        int negative =0;
11        int minAbs = Integer.MAX_VALUE;
12
13        for(int i=0 ;i<n ;i++){
14            for(int j=0 ;j<m ;j++){
15                int abs = Math.abs(arr[i][j]);
16                
17                sum += abs;
18                if(arr[i][j]<0){
19                    negative++;
20                }
21                minAbs = Math.min(minAbs, abs);
22            }
23        }
24
25        if(negative % 2 == 0){
26            return sum;
27        }
28        else{
29            return sum - minAbs - minAbs;
30        }
31    }
32}