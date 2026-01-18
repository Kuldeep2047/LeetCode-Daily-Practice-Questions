// Last updated: 1/18/2026, 1:47:04 PM
1class Solution {
2    public int numberOfStableArrays(int zero, int one, int limit) {
3        int[][][] dp = new int[zero+1][one+1][2];
4        for(int i = 0; i <= zero; i++){
5            for(int j = 0; j <= one; j++){
6                Arrays.fill(dp[i][j], -1);
7            }
8        }
9
10        long a = answer(zero, one, limit, 1, dp);
11        long b = answer(zero, one, limit, 0, dp);
12
13        return (int)((a + b) % 1000000007);
14    }
15
16    public int answer(int zero, int one, int limit, int prev, int[][][] dp){
17        if(zero == 0 && one == 0){
18            return 1;
19        }
20
21        if(dp[zero][one][prev] != -1){
22            return dp[zero][one][prev];
23        }
24
25        long ans =0;
26        //add one if prev is zero
27        if(prev == 0){
28            for(int i=1 ;i<= Math.min(one, limit) ;i++){
29                ans += answer(zero, one - i, limit, 1, dp) % 1000000007;
30            }
31        }
32        //add zero if prev is one
33        else{
34            for(int i=1 ;i<= Math.min(zero, limit) ;i++){
35                ans += answer(zero -i, one, limit, 0, dp) % 1000000007;
36            }
37        }
38
39        return dp[zero][one][prev] =  (int)(ans % 1000000007);
40    }
41}