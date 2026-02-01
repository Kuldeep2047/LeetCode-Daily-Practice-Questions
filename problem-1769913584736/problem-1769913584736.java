// Last updated: 2/1/2026, 8:09:44 AM
1class Solution {
2    public int countMonobit(int n) {
3        return answer(n);
4    }
5    public int answer(int n){
6        int ans =0;
7        for(int i=0 ;i<=n ;i++){
8            if(isAns(i)){
9                ans++;
10            }
11        }
12        return ans;
13    }
14    public boolean isAns(int n){
15        if(n == 0){
16            return true;
17        }
18        int bit = n &1;
19        while(n>0){
20            if((n & 1) != bit){
21                return false;
22            }
23            n >>= 1;
24        }
25        return true;
26    }
27
28    
29    
30}