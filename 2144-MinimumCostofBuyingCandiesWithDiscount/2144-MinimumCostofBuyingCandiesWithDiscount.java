// Last updated: 6/1/2026, 12:32:33 PM
1class Solution {
2    public int minimumCost(int[] cost) {
3        Arrays.sort(cost);
4        int total = 0;
5        int take = 0;
6        for (int i = cost.length - 1; i >= 0; i--) {
7            if (take == 2) {
8                take = 0;
9            } else {
10                total += cost[i];
11                take++;
12            }
13        }
14        return total;
15    }
16}