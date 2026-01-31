// Last updated: 1/31/2026, 10:33:04 PM
1class Solution {
2    static final long mod=1000000007;
3    public int minNonZeroProduct(int p) {
4        long twoToPowerP=(long)Math.pow(2,p);   //2^p
5        long max=twoToPowerP-1;        //2^p -1
6        long ans1=(power(max-1,max/2))%mod;
7        long ans=(((ans1)%mod)*((max)%mod))%mod;
8        return (int)(ans%mod);
9
10    }
11    private long power(long x,long n){
12        if(n==0){
13            return 1;
14        }
15        if (n == 1) return (x % mod);
16        if(n%2==0){
17            return power(((x % mod)*(x % mod))%mod,n/2);
18        }else{
19            return ((x % mod)*power((x % mod),n-1))%mod;
20        }
21    }
22}