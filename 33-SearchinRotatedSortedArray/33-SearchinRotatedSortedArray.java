// Last updated: 4/18/2026, 4:25:03 PM
1class Solution {
2    public int rob(int[] nums) {
3        if(nums.length == 1){
4            return nums[0];
5        }
6        int a = answer(nums, 0, nums.length -2);
7        int b = answer(nums, 1, nums.length -1);
8        return Math.max(a,b);
9    }
10
11    public int answer(int[] arr, int si, int ei){
12        int curr =0;
13        int prev =0;
14
15        while(si <= ei){
16            int t = Math.max(curr, prev + arr[si]);
17
18            prev = curr;
19            curr = t;
20            si++;
21        }
22        return curr;
23    }
24}