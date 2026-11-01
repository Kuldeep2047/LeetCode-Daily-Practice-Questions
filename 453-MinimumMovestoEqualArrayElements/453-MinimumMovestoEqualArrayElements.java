// Last updated: 11/1/2026, 4:20:51 PM
1class Solution {
2    public int minMoves(int[] nums) {
3        int move=0;
4        int min=Integer.MAX_VALUE;
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]<min){
7                min=nums[i];
8            }
9        }
10        for(int i=0;i<nums.length;i++){
11            move += nums[i]-min;
12        }
13        return move;
14    }
15}