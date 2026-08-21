// Last updated: 8/21/2026, 3:35:16 PM
1class Solution {
2    public int numSubseq(int[] nums, int target) {
3        return answer(nums, target);
4    }
5
6    public int answer(int[] arr ,int tar){
7        int n = arr.length;
8        long c =0;
9        Arrays.sort(arr);
10        int mod = 1000000007;
11
12        int[] pow = new int[n];
13        pow[0] = 1;
14        for(int i=1 ;i<n ;i++){
15            pow[i] = (int)(((long) pow[i - 1] * 2) % mod);
16        }
17
18        int si =0;
19        int ei = n-1;
20        while(si <= ei){
21            
22            int sum = arr[si] + arr[ei];
23            if(sum <= tar){
24                c += (pow[ei-si]) % mod;
25                si++;
26            }else{
27                ei--;
28            }
29            
30        } 
31        return (int)(c % mod);
32        
33    }
34}