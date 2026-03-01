// Last updated: 3/1/2026, 11:46:34 AM
1class Solution {
2    public int minCost(int n) {
3        return answer(n);
4    }
5    public int answer(int n){
6        
7        int ans = n * (n-1) /2;
8        return ans;
9    }
10}