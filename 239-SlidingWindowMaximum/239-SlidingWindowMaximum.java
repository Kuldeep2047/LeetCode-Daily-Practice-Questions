// Last updated: 8/12/2026, 9:18:52 AM
1class Solution {
2    public int[] maxSlidingWindow(int[] nums, int k) {
3        return answer(nums, k);
4    }
5
6    public int[] answer(int[] arr ,int k){
7        int n = arr.length;
8
9        int[] prefix = new int[n];
10        for(int i=0 ;i<n ;i++){
11            if(i % k== 0){
12                prefix[i] = arr[i];
13            }
14            else{
15                prefix[i] = Math.max(prefix[i-1], arr[i]);
16            }
17        }
18
19        int[] suffix = new int[n];
20        for(int i = n-1 ; i>=0 ;i--){
21            if(i%k == 0 || i == n-1){
22                suffix[i] = arr[i];
23            }else{
24                suffix[i] = Math.max(suffix[i+1], arr[i]);
25            }
26        }
27
28        int[] ans = new int[n-k+1];
29
30        for(int i= k-1 ;i<n ;i++){
31            int j = i-k+1;
32            ans[j] = Math.max(prefix[i], suffix[j]);
33        }
34        return ans;
35
36    }
37}