// Last updated: 1/30/2026, 10:23:36 PM
1class Solution {
2    public long perfectPairs(int[] nums) {
3        int n = nums.length;
4        long[] arr = new long[n];
5        for(int i=0;i<n;i++){
6            arr[i] = Math.abs((long)nums[i]);
7        }
8        return answer(arr,n);
9        
10    }
11    public static long answer(long[] arr,int n){
12        
13        Arrays.sort(arr);
14
15        int si =0;
16        int ei =0;
17        long ans =0;
18
19        while(si<n){
20            if(ei<=si){
21                ei = si+1;
22            }
23            while(ei<n && arr[ei]<= 2 * arr[si]){
24                ei++;
25            }
26
27            ans = ans + (ei-si-1);
28            si++;
29        }
30        return ans;
31    }
32}