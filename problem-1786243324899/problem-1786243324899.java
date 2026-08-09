// Last updated: 8/9/2026, 8:12:04 AM
1class Solution {
2    public double minPrice(int[] prices, int[] discounts) {
3        Arrays.sort(prices);
4        Arrays.sort(discounts);
5        return answer(prices, discounts);
6    }
7
8    public double answer(int[] price, int[] dis){
9        int n = price.length;
10        int m = dis.length;
11
12        double p = 0;
13        for(int a : price){
14            p += a;
15        }
16
17        for(int i=0 ;i<Math.min(n,m) ;i++){
18            int d = dis[m-i-1];
19            int pr = price[n-i-1];
20
21            p -= (double)pr * d / 100;
22        }
23
24        return p;
25    }
26}