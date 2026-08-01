// Last updated: 8/1/2026, 3:10:40 PM
1class Solution {
2    public boolean predictTheWinner(int[] nums) {
3        int[][] dp = new int[nums.length][nums.length];
4
5        for(int[] r : dp){
6            Arrays.fill(r, -1);
7        }
8        int score_diff = Score(nums, 0, nums.length-1,dp);
9        return score_diff >=0;
10    }
11
12    public int Score(int[] nums, int l, int r, int[][] dp){
13        if(l == r){
14            return nums[l];
15        }
16        if(dp[l][r] != -1){
17            return dp[l][r];
18        }
19
20        int left = nums[l] - Score(nums, l+1, r, dp);
21        int right = nums[r] - Score(nums, l, r-1, dp);
22
23        return dp[l][r] = Math.max(left, right);
24    }
25}