// Last updated: 1/10/2026, 11:13:20 PM
1class Solution {
2    public int longestSubsequence(int[] arr, int difference) {
3        // return answer(arr, difference);
4        return answer2(arr, difference);
5    }
6    public int answer2(int[] arr, int diff){
7        int n = arr.length;
8        Map<Integer, Integer> map = new HashMap<>();
9        int ans =0;
10
11        for(int i=0 ;i<n ;i++){
12            int prev = map.getOrDefault(arr[i]-diff, 0);
13            int len = prev +1;
14            ans = Math.max(ans, len);
15            map.put(arr[i], len);
16        }
17
18        return ans;
19    }
20
21    // public int answer(int[] arr, int diff){
22    //     int n = arr.length;
23    //     int[] dp = new int[n];
24    //     Arrays.fill(dp ,1);
25    //     int max = 1;
26
27    //     for(int i=0 ;i<n ;i++){
28    //         for(int j=i-1 ;j>=0 ;j--){
29    //             if(arr[i] - arr[j] == diff){
30    //                 dp[i] = Math.max(dp[i], dp[j]+1);
31    //                 max = Math.max(max, dp[i]);
32    //             }
33    //         }
34    //     }
35
36    //     return max;
37    // }
38}