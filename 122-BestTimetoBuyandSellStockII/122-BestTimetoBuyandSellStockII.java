// Last updated: 9/20/2026, 5:02:08 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        return answer(prices);
4    }
5
6    public int answer(int[] arr){
7        int n = arr.length;
8        int max_Profit =0;
9
10        for(int i=0 ;i<n-1 ;i++){
11            if(arr[i] < arr[i+1]){
12                int profit = arr[i+1] - arr[i];
13                max_Profit += profit;
14            }
15        }
16
17        return max_Profit;
18    }
19}