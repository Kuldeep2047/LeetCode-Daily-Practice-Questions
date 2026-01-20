// Last updated: 1/20/2026, 3:20:07 PM
1class Solution {
2    public String removeOuterParentheses(String s) {
3        return answer(s);
4    }
5
6    public String answer(String s){
7        int n = s.length();
8        // Stack<Character> st = new Stack<>();
9        int c =0;
10        StringBuilder sb = new StringBuilder();
11        for(int i=0 ;i<n ;i++){
12            char ch  = s.charAt(i);
13            if(ch == '('){
14                if(c>0){
15                    sb.append('(');
16                }
17                c++;
18            }
19            else{
20                c--;
21                if(c>0){
22                    sb.append(')');
23                }
24            }
25        }
26        return sb.toString();
27    }
28}