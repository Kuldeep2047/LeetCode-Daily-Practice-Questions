// Last updated: 6/19/2026, 8:35:50 AM
1class Solution {
2    public int largestAltitude(int[] gain) {
3        int sum=0;
4        int ans = 0;
5        for(int i=0;i<gain.length;i++){
6            sum+=gain[i];
7            ans = Math.max(ans,sum);
8        }
9        return ans;
10    }
11}