// Last updated: 2/6/2026, 2:29:59 PM
1class Solution {
2    static final long MOD = 1_000_000_007;
3
4    public int monkeyMove(int n) {
5        long totalWays = modPow(2, n);
6        long result = (totalWays - 2 + MOD) % MOD;
7        return (int) result;
8    }
9
10    
11    private long modPow(long base, int exp) {
12        long result = 1;
13        while (exp > 0) {
14            if ((exp & 1) == 1) {
15                result = (result * base) % MOD;
16            }
17            base = (base * base) % MOD;
18            exp >>= 1;
19        }
20        return result;
21    }
22}
23