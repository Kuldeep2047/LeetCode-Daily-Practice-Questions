// Last updated: 4/1/2026, 3:19:07 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3        return answer(nums);
4    }
5    public int answer(int[] arr){
6        int xor = 0;
7        for(int a : arr){
8            xor ^= a;
9        }
10        return xor;
11    }
12}