// Last updated: 1/5/2026, 11:00:22 AM
1class Solution {
2    public int maximalSquare(char[][] matrix) {
3        return answer(matrix);
4    }
5
6    public int answer(char[][] arr){
7        int  n = arr.length;
8        int m = arr[0].length;
9        int[][] dp = new int[n][m];
10        int ans =0;
11
12        for(int i=0 ;i<n ;i++){
13            for(int j=0 ;j<m ;j++){
14                if(i == 0 || j ==0 ){
15                    dp[i][j] = arr[i][j] - '0';
16                }else{
17                    if(arr[i][j] == '1'){
18                        dp[i][j] = 1+  Math.min(dp[i][j-1], Math.min(dp[i-1][j-1], dp[i-1][j]));
19                    }else{
20                        dp[i][j] = 0;
21                    }
22                }
23                // ans += dp[i][j];
24                ans = Math.max(ans, dp[i][j]);
25
26            }
27        }
28        return ans * ans;
29
30
31    }
32}