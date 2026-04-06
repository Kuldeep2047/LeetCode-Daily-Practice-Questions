// Last updated: 4/6/2026, 2:52:38 PM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int[] ans = new int[2];
4        ans[0] = answer(nums, target, true);
5        ans[1] = answer(nums, target, false);
6        return ans;
7    }
8
9    public int answer(int[] nums ,int target, boolean isLeft){
10        int left = 0;
11        int right = nums.length - 1;
12        int idx = -1;
13
14        while (left <= right) {
15            int mid = left + (right - left) / 2;
16            
17            if (nums[mid] > target) {
18                right = mid - 1;
19            } else if (nums[mid] < target) {
20                left = mid + 1;
21            } else {
22                idx = mid;
23                if (isLeft) {
24                    right = mid - 1;
25                } else {
26                    left = mid + 1;
27                }
28            }
29        }
30
31        return idx;
32    }
33}