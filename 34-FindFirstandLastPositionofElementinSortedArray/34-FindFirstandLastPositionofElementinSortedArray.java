// Last updated: 4/6/2026, 2:53:06 PM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int[] ans = new int[2];
4        ans[0] = answer(nums, target, true);
5        ans[1] = answer(nums, target, false);
6        return ans;
7    }
8
9    public int answer(int[] arr ,int tar, boolean isLeft){
10        int n = arr.length;
11        int si =0;
12        int ei = n-1;
13        int index = -1;
14        while(si <= ei){
15            int mid = ei + (si - ei)/2;
16
17            if(arr[mid] < tar){
18                si = mid+1;
19            }
20            else if(arr[mid] > tar){
21                ei = mid-1;
22            }else{
23                index = mid;
24                if(isLeft){
25                    ei = mid-1;
26                }else{
27                    si = mid+1;
28                }
29
30            }
31        }
32        return index;
33    }
34}