// Last updated: 1/25/2026, 12:04:00 PM
1class Solution {
2    public int minimumPrefixLength(int[] nums) {
3        return answer(nums);
4    }
5    public int answer(int[] arr){
6        int n = arr.length;
7
8        for(int i=n-2 ;i>=0 ;i--){
9            if(arr[i]>=arr[i+1]){
10                return i+1;
11            }
12        }
13        return 0;
14    }
15}