// Last updated: 6/6/2026, 11:23:15 AM
1class Solution {
2    public int[] leftRightDifference(int[] nums) {
3        return answer(nums);
4    }
5    public static int[] answer(int[] nums){
6        int n = nums.length;
7        int sum =0;
8        int[] ans = new int[n];
9        int leftSum =0;
10        int rightSum =0;
11
12        for(int a : nums){
13            rightSum += a;
14        }
15
16        for(int i=0 ;i<n ;i++){
17            leftSum += nums[i];
18            ans[i] = Math.abs(rightSum - leftSum);
19            rightSum = rightSum - nums[i];
20        }
21        return ans;
22    }
23}