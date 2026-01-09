// Last updated: 1/9/2026, 11:18:27 PM
1class Solution {
2    public int maximumLength(int[] nums, int k) {
3        return answer(nums, k);
4    }
5
6    public int answer(int[] arr, int k){
7        int n = arr.length;
8        int[][] dp = new int[k][n];
9        for(int[] ar : dp){
10            Arrays.fill(ar,1);
11        }
12
13        int ans = 1;
14        for(int i = 0; i<n; i++){
15            for(int j = i-1; j>=0; j--){
16                int mod = (arr[i]+arr[j]) % k;
17                dp[mod][i] = Math.max(dp[mod][i] , dp[mod][j] + 1);
18                ans = Math.max(ans,dp[mod][i]);
19            }
20        }
21        return ans;
22    }
23}