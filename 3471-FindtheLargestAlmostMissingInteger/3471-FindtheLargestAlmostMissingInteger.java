// Last updated: 8/18/2026, 1:04:55 PM
1class Solution {
2    public int largestInteger(int[] nums, int k) {
3        return largest(nums,k);
4    }
5    public static int largest(int[] nums,int k){
6        Set<Integer> set   = new HashSet<>();
7        int n = nums.length;
8        int[] count = new int[51];
9        for(int i=0;i<k;i++){
10            set.add(nums[i]);
11        }
12        for(int ele:set){
13            count[ele]++;
14        }
15
16        for(int i=k;i<n;i++){
17            set.clear();
18            for(int j=i-k+1;j<=i;j++){
19                set.add(nums[j]);
20            }
21            for(int ele:set){
22                count[ele]++;
23            }
24        }
25        for(n=50;n>=0;n--){
26            if(count[n]==1){
27                return n;
28            }
29        }
30        return -1;
31        
32    }
33}