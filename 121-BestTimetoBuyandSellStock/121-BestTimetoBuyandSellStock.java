// Last updated: 9/20/2026, 4:48:08 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        return answer(prices);
4    }
5
6    public int answer(int[] arr){
7        int max_Profit = 0;
8        int buy = arr[0];
9        int profit = 0;
10        for(int i=1 ;i<arr.length ;i++){
11            if(arr[i] < buy){
12                buy = arr[i];
13            }
14            profit = arr[i] - buy;
15            max_Profit = Math.max(max_Profit, profit);
16        }
17
18        return max_Profit;
19    }
20}