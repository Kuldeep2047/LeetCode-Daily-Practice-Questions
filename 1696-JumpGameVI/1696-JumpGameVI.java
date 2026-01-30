// Last updated: 1/30/2026, 12:34:07 PM
1class Solution {
2    public int maxResult(int[] nums, int k) {
3        int n = nums.length;
4        // int[] dp = new int[n];
5        // for(int i=0 ;i<n-1 ;i++){
6        //     dp[i] = Integer.MIN_VALUE;
7        // }
8        // return answer(nums, k,0,dp);
9
10        return answer(nums ,k);
11    }
12    public int answer(int[] arr ,int k){
13        int n = arr.length;
14        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b)-> b[1] - a[1]);
15        int ans = arr[0]; // this contain max value till curr index
16        pq.add(new int[]{0, ans});
17        for(int i=1 ;i<n ;i++){
18            while(!(i - pq.peek()[0] <= k)){
19                pq.poll();
20            }
21            ans = arr[i] + pq.peek()[1];
22            pq.add(new int[]{i, ans});
23        }
24
25        return ans;
26    }
27    // public int answer(int[] arr, int k, int idx,int[] dp){
28    //     if(idx == arr.length-1){
29    //         return arr[idx];
30    //     }
31    //     if(dp[idx] != Integer.MIN_VALUE){
32    //         return dp[idx];
33    //     }
34    //     int sum =Integer.MIN_VALUE;;
35        
36    //     for(int i=idx+1 ;i<=Math.min(arr.length-1, idx+k); i++){
37    //         sum = Math.max(sum, answer(arr,k,i,dp));
38    //     }
39    //     return dp[idx] =  arr[idx] +sum;
40    // }
41}