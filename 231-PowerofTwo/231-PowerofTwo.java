// Last updated: 1/14/2026, 11:38:55 AM
1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        return n > 0 && (n & (n - 1)) == 0;
4    }
5}