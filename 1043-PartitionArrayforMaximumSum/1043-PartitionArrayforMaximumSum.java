// Last updated: 1/6/2026, 3:19:14 PM
1class Solution {
2    public int maxSumAfterPartitioning(int[] arr, int k) {
3        int[] dp = new int[arr.length];
4        Arrays.fill(dp, -1);
5        return answer(arr, 0, k, dp);
6    }
7    public int answer(int[] arr, int idx, int k, int[] dp){
8        if(idx == arr.length){
9            return 0;
10        }
11        int max_val =0;
12        int best =0;
13
14        if(dp[idx] != -1){
15            return dp[idx];
16        }
17
18        for(int i=1 ;i<=k ;i++){
19            if(idx + i > arr.length){
20                break;
21            }
22            max_val = Math.max(max_val, arr[idx + i-1]);
23            int curr_sum = max_val * i;
24            best = Math.max(best, curr_sum + answer(arr, idx + i, k, dp));
25        }
26        return dp[idx] = best;
27    }
28}