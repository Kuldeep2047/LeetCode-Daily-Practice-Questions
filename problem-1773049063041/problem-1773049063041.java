// Last updated: 3/9/2026, 3:07:43 PM
1class Solution {
2    public int maxArea(int[] height) {
3        return answer(height);
4    }
5
6    public int answer(int[] arr){
7        int n = arr.length;
8        int left =0;
9        int right = n-1;
10
11        int ans = Integer.MIN_VALUE;
12
13        while(left < right){
14            int w = right - left;
15            int h = Math.min(arr[left], arr[right]);
16            ans = Math.max(ans, w*h);
17
18            if(arr[right] < arr[left]){
19                right--;
20            }else{
21                left++;
22            }
23        }
24        return ans;
25    }
26}