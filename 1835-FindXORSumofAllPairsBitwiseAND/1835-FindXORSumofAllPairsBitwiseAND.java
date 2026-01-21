// Last updated: 1/21/2026, 12:09:56 PM
1class Solution {
2    public int getXORSum(int[] arr1, int[] arr2) {
3        int xor1 = 0;
4        for(int a : arr1){
5            xor1 ^= a;
6        }
7        int xor2 =0;
8        for(int a : arr2){
9            xor2 ^= a;
10        }
11        return xor1 & xor2;
12    }
13}