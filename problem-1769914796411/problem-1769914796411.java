// Last updated: 2/1/2026, 8:29:56 AM
1class Solution {
2    public int finalElement(int[] nums) {
3        return answer(nums);
4    }
5    public int answer(int[] arr){
6        int n = arr.length;
7
8        int a = arr[0];
9        int b = arr[n-1];
10        return Math.max(a,b);
11        // Arrays.sort(arr);
12        // int max = 0;
13        // for(int a : arr){
14        //     max = Math.max(max, a);
15        // }
16
17        // if(n % 2 != 1){
18        //     return max;
19        // }
20        // else{
21        //     return Math.max(arr[0], arr[n-1]);
22        // }
23
24        // if(n % 2 == 0){
25        //     return arr[n-1];
26        // }
27        // else{
28        //     // return arr[0];
29        //     return arr[n/2];
30        // }
31    }
32}