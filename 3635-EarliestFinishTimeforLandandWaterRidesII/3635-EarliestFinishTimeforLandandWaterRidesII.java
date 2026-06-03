// Last updated: 6/3/2026, 12:10:39 PM
1class Solution {
2    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
3        int a = answer(landStartTime,landDuration,waterStartTime,waterDuration);
4        int b = answer(waterStartTime,waterDuration,landStartTime,landDuration);
5        
6        return Math.min(a,b);
7    }
8
9    private int answer(int[] ls, int[] ld,int[] ws, int[] wd) {
10
11        int mini = Integer.MAX_VALUE;
12
13        for(int i = 0; i < ls.length; i++) {
14            mini = Math.min(mini, ls[i] + ld[i]);
15        }
16
17        int ans = Integer.MAX_VALUE;
18
19        for(int i = 0; i < ws.length; i++) {
20            ans = Math.min(ans, Math.max(mini, ws[i]) + wd[i]);
21        }
22
23        return ans;
24    }
25}