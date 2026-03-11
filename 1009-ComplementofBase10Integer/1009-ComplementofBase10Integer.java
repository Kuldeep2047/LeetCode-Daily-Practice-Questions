// Last updated: 3/11/2026, 11:53:23 PM
1class Solution {
2    public int bitwiseComplement(int n) {
3        if(n==0) return 1;
4
5        int ans=0;
6        int i=0;
7
8        while(n>0){
9            int bit=n%2;
10
11            if(bit==0){
12                ans += Math.pow(2,i);
13            }
14
15            i++;
16            n/=2;
17        }
18
19        return ans;
20    }
21}