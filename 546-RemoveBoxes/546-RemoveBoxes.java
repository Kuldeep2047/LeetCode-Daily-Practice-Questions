// Last updated: 1/10/2026, 5:42:32 PM
1class Solution {
2
3    public int removeBoxes(int[] boxes) {
4        int n = boxes.length;
5        int[][][] dp = new int[n][n][n];
6        return answer(boxes, 0, n - 1, 0, dp);
7    }
8
9    public int answer(int[] arr, int l, int r, int count, int[][][] dp) {
10        if(l > r){
11            return 0;
12        }
13
14        if(dp[l][r][count] != 0){
15            return dp[l][r][count];
16        }
17
18        int nl = l;
19        int nc = count;
20
21        // compress same-colored boxes at the left
22        while (nl + 1 <= r && arr[nl] == arr[nl + 1]) {
23            nl++;
24            nc++;
25        }
26
27        //remove now
28        int ans = (nc + 1)*(nc + 1) + answer(arr, nl + 1, r, 0, dp);
29
30        //merge later
31        for (int i = nl + 1; i <= r; i++) {
32            if (arr[nl] == arr[i]) {
33                ans = Math.max(
34                    ans,
35                    answer(arr, i, r, nc + 1, dp) + answer(arr, nl + 1, i - 1, 0, dp)
36                );
37            }
38        }
39
40        return dp[l][r][count] = ans;
41    }
42}
43