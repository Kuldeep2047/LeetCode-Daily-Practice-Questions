// Last updated: 6/2/2026, 11:33:19 AM
1class Solution {
2    public int earliestFinishTime(int[] lst, int[] ldu,
3                                 int[] wst, int[] wdu) {
4
5        int ans = Integer.MAX_VALUE;
6
7        for (int i = 0; i < lst.length; i++) {
8            int t = lst[i] + ldu[i];
9
10            for (int j = 0; j < wst.length; j++) {
11                ans = Math.min(ans, Math.max(t, wst[j]) + wdu[j]);
12            }
13        }
14
15        for (int i = 0; i < wst.length; i++) {
16            int t = wst[i] + wdu[i];
17
18            for (int j = 0; j < lst.length; j++) {
19                ans = Math.min(ans, Math.max(t, lst[j]) + ldu[j]);
20            }
21        }
22
23        return ans;
24    }
25}