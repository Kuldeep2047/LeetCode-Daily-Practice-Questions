// Last updated: 5/14/2026, 10:00:35 PM
1class Solution {
2    public int jump(int[] nums) {
3        return Jump_2(nums);
4    }
5    public static int Jump_2(int[] arr){
6        int n = arr.length;
7        int farthest = 0;
8        int jump =0;
9        int end = 0;
10        for(int i = 0; i< n-1;i++){
11            farthest = Math.max(farthest, arr[i]+i);
12            if(i == end){
13                jump++;
14                end = farthest;
15            }
16        }
17        return jump;
18    }
19}