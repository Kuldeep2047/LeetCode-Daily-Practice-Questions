// Last updated: 7/26/2026, 9:48:13 PM
1class Solution {
2    public int maximumProduct(int[] nums) {
3        return answer(nums);
4    }
5    public int answer(int[] arr){
6        Arrays.sort(arr);
7        int n = arr.length;
8        int a = arr[0]*arr[1]*arr[n-1];
9        int b = arr[n-1] * arr[n-2] * arr[n-3];
10        return Math.max(a,b);
11    }
12}