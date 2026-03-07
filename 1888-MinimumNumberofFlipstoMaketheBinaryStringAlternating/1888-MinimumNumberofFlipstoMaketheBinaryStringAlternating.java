// Last updated: 3/7/2026, 3:44:56 PM
1class Solution {
2    public int minFlips(String s) {
3        int n = s.length();
4        String t = s + s;
5
6        int diff1 = 0, diff2 = 0;
7        int ans = Integer.MAX_VALUE;
8
9        for (int i = 0; i < 2 * n; i++) {
10            char expect1 = (i % 2 == 0) ? '0' : '1'; // 0101...
11            char expect2 = (i % 2 == 0) ? '1' : '0'; // 1010...
12
13            if (t.charAt(i) != expect1) diff1++;
14            if (t.charAt(i) != expect2) diff2++;
15
16            if (i >= n) {
17                char oldExpect1 = ((i - n) % 2 == 0) ? '0' : '1';
18                char oldExpect2 = ((i - n) % 2 == 0) ? '1' : '0';
19
20                if (t.charAt(i - n) != oldExpect1) diff1--;
21                if (t.charAt(i - n) != oldExpect2) diff2--;
22            }
23
24            if (i >= n - 1) {
25                ans = Math.min(ans, Math.min(diff1, diff2));
26            }
27        }
28
29        return ans;
30    }
31}