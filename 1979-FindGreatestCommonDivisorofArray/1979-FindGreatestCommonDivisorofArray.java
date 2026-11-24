// Last updated: 11/24/2026, 12:53:52 PM
1class Solution {
2    public int findGCD(int[] nums) {
3        int mn = 100000;
4        int mx = 0;
5
6        for(int a : nums){
7            if (a < mn)
8                mn = a;
9            if (a > mx)
10                mx = a;
11        }
12
13        return gcd(mn, mx);
14    }
15
16    public static int gcd(int a, int b) {
17        while(b != 0){
18            int rem = a % b;
19            a = b;
20            b = rem;
21        }
22        return a;
23    }
24}