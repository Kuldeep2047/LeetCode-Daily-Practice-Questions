// Last updated: 1/20/2026, 3:41:15 PM
1class Solution {
2    public String removeOuterParentheses(String s) {
3        return answer2(s);
4    }
5
6    public String answer2(String s){
7        int n = s.length();
8        int si =0;
9        int ei =0;
10        int c =0;
11        StringBuilder sb = new StringBuilder();
12
13        for( ; ei <n ; ei++){
14            char ch = s.charAt(ei);
15            if(ch == '('){
16                c++;
17            }
18            else{
19                c--;
20            }
21            if(c == 0){
22                sb.append(s.substring(si+1, ei));
23                si = ei+1;
24            }
25        }
26
27        return sb.toString();
28    }
29
30    public String answer(String s){
31        int n = s.length();
32        // Stack<Character> st = new Stack<>();
33        int c =0;
34        StringBuilder sb = new StringBuilder();
35        for(int i=0 ;i<n ;i++){
36            char ch  = s.charAt(i);
37            if(ch == '('){
38                if(c>0){
39                    sb.append('(');
40                }
41                c++;
42            }
43            else{
44                c--;
45                if(c>0){
46                    sb.append(')');
47                }
48            }
49        }
50        return sb.toString();
51    }
52}