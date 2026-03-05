// Last updated: 3/5/2026, 11:39:28 AM
1class Solution {
2    public int minOperations(String s) {
3        return answer(s);
4    }
5
6    public int answer(String s){
7        int n = s.length();
8        int c1 =0;
9        int c2 =0;
10
11        for(int i=0 ;i<n ;i++){
12            char poss1 = '0';
13            if(i % 2 != 0){
14                poss1 = '1';
15            }
16            if(s.charAt(i) != poss1){
17                c1++;
18            }
19
20            char poss2 = '1';
21            if(i % 2 != 0){
22                poss2 = '0';
23            }
24            if(s.charAt(i) != poss2){
25                c2++;
26            }
27        }
28
29        return Math.min(c1, c2);
30
31    }
32}