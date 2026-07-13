// Last updated: 7/13/2026, 9:30:11 AM
1class Solution {
2    public int maxArea(int[] height) {
3        return answer(height);
4    }
5
6    public int answer(int[] arr){
7        int n = arr.length;
8        int left =0;
9        int right = n-1;
10        int ans = Integer.MIN_VALUE;
11
12        while(left  <= right){
13            int h = Math.min(arr[left], arr[right]);
14            int w = right - left;
15            ans = Math.max(ans, h * w);
16
17            if(arr[left] < arr[right]){
18                left++;
19            }else{
20                right--;
21            }
22        }
23        return ans;
24    }
25}