// Last updated: 3/6/2026, 6:34:27 PM
1class Solution {
2    public boolean checkOnesSegment(String s) {
3        return answer(s);
4    }
5    public boolean answer(String s){
6        int n = s.length();
7        int c =0;
8        int ans =0;
9        for(int i=0 ;i<n ;i++){
10            char ch = s.charAt(i);
11            if(ch == '1'){
12                c++;
13            }else{
14                if(c > 0){
15                    ans++;
16                }
17                c = 0;
18            }
19        }
20        if(c > 0){
21            ans++;
22        }
23
24        return ans <= 1;
25    }
26}