// Last updated: 1/30/2026, 11:30:26 AM
1class Solution {
2    public int minOperations(int[] nums) {
3        return answer(nums);
4    }
5
6    public int answer(int[] arr){
7        int n = arr.length;
8        int ans =0;
9        for(int i=0 ;i<n-2 ;i++){
10            if(arr[i] == 1){
11                continue;
12            }
13            else{
14                arr[i] = 1 - arr[i];
15                arr[i+1] = 1 - arr[i+1];
16                arr[i+2] = 1 - arr[i+2];
17                ans++;
18            }
19        }
20        if(arr[n-1] == 0 || arr[n-2] == 0){
21            return -1;
22        }
23        return ans;
24    }
25}