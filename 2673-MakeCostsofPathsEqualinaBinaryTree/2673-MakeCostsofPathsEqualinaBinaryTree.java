// Last updated: 2/20/2026, 11:29:04 AM
1class Solution {
2    int ans = 0;
3    public int minIncrements(int n, int[] cost) {
4        
5        answer(n, 1, cost);
6        return ans;
7    }
8
9    public int answer(int n, int root, int[] cost){
10        if(root > n){
11            return 0;
12        }
13
14        int left = answer(n, root * 2 , cost);
15        int right = answer(n, root*2 +1, cost);
16
17        ans += Math.abs(left - right);
18
19        return cost[root - 1] + Math.max(left, right);
20    }
21}