// Last updated: 5/10/2026, 10:51:11 PM
1class Solution {
2    public int maximumJumps(int[] nums, int target) {
3
4        int[] dp = new int[nums.length];
5        Arrays.fill(dp, -1);
6        dp[0] = 0;
7
8        for (int i = 0; i < nums.length; i++) {
9            if (i > 0 && dp[i] <= 0) {
10                continue;
11            }
12
13            for (int j = i + 1; j < nums.length; j++) {
14
15                if (Math.abs(nums[i] - nums[j]) <= Math.abs(target)) {
16
17                    dp[j] = Math.max(dp[j], dp[i] + 1);
18                }
19            }
20        }
21
22        return dp[nums.length - 1];
23    }
24}