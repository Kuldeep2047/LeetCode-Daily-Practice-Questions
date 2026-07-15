// Last updated: 7/15/2026, 12:44:56 PM
1class Solution {
2    public int gcdOfOddEvenSums(int n) {
3        return answer(n);
4    }
5    public int answer(int n){
6        int odd = (int)Math.pow(n,2);
7        int even = n* (n+1);
8        return gcd(odd,even);
9    }
10    public int gcd(int a,int b){
11        while(b%a !=0){
12            int rem = b%a;
13            b=a;
14            a=rem;
15        }
16        return a;
17    }
18}