// Last updated: 2/1/2026, 3:05:11 PM
1class Solution {
2    public int minimumCost(int[] nums) {
3        return answer(nums);
4    }
5    public int answer(int[] arr){
6        int n = arr.length;
7
8        int min1 = Integer.MAX_VALUE;
9        int min2 = Integer.MAX_VALUE;
10
11        for(int i=1 ;i<n ;i++){
12            if(arr[i] < min1){
13                min2 = min1;
14                min1 = arr[i];
15            }
16            else if(arr[i] < min2){
17                min2 = arr[i];
18            }
19        }
20
21        return arr[0] + min1 + min2;
22    }
23}