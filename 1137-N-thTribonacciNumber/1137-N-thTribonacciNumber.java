// Last updated: 1/6/2026, 9:34:54 PM
1class Solution {
2    public int tribonacci(int n) {
3        return answer(n);
4    }
5    public int answer(int n){
6        int[] arr = new int[38];
7        arr[0] = 0;
8        arr[1] = 1;
9        arr[2] = 1;
10        for(int i=3 ; i<=n ;i++){
11            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
12        }
13        return arr[n];
14    }
15
16}