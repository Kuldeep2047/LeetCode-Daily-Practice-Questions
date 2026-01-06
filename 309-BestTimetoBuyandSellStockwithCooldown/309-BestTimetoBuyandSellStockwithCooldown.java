// Last updated: 1/6/2026, 11:39:34 AM
1class Solution {
2    public int maxProfit(int[] prices) {
3        if(prices.length == 1){
4            return 0;
5        }
6        return answer(prices);
7    }
8    public int answer(int[] arr){
9        int n = arr.length;
10        int buy = -arr[0];
11        int sell = 0;
12        int cool =0;
13        for(int i=1 ;i<n ;i++){
14            int prebuy = buy;
15            int precool = cool;
16            int presell = sell;
17
18            buy = Math.max(prebuy, precool-arr[i]);
19            sell = prebuy + arr[i];
20            cool = Math.max(precool, presell);
21        }
22        return Math.max(sell, cool);
23    }
24}