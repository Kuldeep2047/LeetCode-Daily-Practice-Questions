// Last updated: 1/25/2026, 9:55:56 PM
1class Solution {
2    public long minimalKSum(int[] nums, int k) {
3        return Minimal_Sum(nums,k);
4    }
5    public static long Minimal_Sum(int[] nums,int k){
6        int n=nums.length;
7        Arrays.sort(nums);
8        int num=1;
9        int i=0;
10        long ans=0;
11        while(k>0){
12            if(i<n&&num==nums[i]){
13               
14                while(i+1<n&&nums[i]==nums[i+1]){
15                    i++;
16                }
17                 i++;
18                num++;
19            }else{
20                ans+=num;
21                num++;
22                k--;
23
24            }
25        }
26        return ans;
27    }
28}