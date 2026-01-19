// Last updated: 1/19/2026, 9:20:15 PM
1class Solution {
2    public int longestBalanced(int[] nums) {
3        return answer(nums);
4    }
5    public int answer(int[] arr){
6        int n = arr.length;
7        int ans=0;
8
9        for(int i=0 ;i<n ;i++){
10            HashSet<Integer> odd = new HashSet<>();
11            HashSet<Integer> even = new HashSet<>();
12
13            for(int j=i ;j<n ;j++){
14                if(arr[j]% 2 == 0){
15                    even.add(arr[j]);
16                }
17                else{
18                    odd.add(arr[j]);
19                }
20                if(even.size() == odd.size()){
21                    ans = Math.max(ans, j-i+1);
22                }
23            }
24        }
25
26        return ans;
27    }
28
29}