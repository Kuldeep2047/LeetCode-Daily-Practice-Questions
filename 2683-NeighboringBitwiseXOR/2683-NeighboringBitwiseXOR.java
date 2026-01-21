// Last updated: 1/21/2026, 11:34:07 AM
1class Solution {
2    public boolean doesValidArrayExist(int[] derived) {
3        int xor =0;
4		for(int a : derived) {
5			xor = xor ^ a;
6		}
7		return xor == 0;
8    }
9}