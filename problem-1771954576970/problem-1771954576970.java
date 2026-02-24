// Last updated: 2/24/2026, 11:06:16 PM
1class Solution {
2    public int scoreDifference(int[] nums) {
3        return answer(nums);
4    }
5    public int answer(int[] arr){
6        int n = arr.length;
7        int a =0;
8        int b =0;
9        int player = 0;
10
11        for(int i=0 ;i<n ;i++){
12            if(arr[i] % 2 != 0){
13                player = 1- player;
14            }
15            if((i+1) % 6 == 0 ){
16                player = 1- player;
17            }
18            if(player == 0){
19                a += arr[i];
20            }else{
21                b += arr[i];
22            }
23        }
24
25        return a - b;
26    }
27}