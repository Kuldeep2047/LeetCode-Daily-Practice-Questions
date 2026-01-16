// Last updated: 1/16/2026, 10:20:53 PM
1class Solution {
2    public int minElements(int[] nums, int limit, int goal) {
3        return Minimum_Element(nums,limit,goal);
4    }
5    public static int Minimum_Element(int[] nums,int limit,int goal){
6        long sum=0;
7        for(int i=0;i<nums.length;i++){
8            sum+=nums[i];
9        }
10        if(sum==goal){
11            return 0;
12        }
13        long diff = Math.abs(goal-sum);
14        int ans = (int)(diff/limit);
15        if(diff%limit !=0){
16            ans++;
17        }
18        return ans;
19
20    }
21}