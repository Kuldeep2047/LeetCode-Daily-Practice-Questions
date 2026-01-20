// Last updated: 1/20/2026, 2:33:15 PM
1class Solution {
2    public boolean backspaceCompare(String s, String t) {
3        //get the content of string after perform backspace operation
4        Stack<Character> a = get_Stack(s);
5        Stack<Character> b = get_Stack(t);
6
7        return a.equals(b);
8    }
9
10    public Stack<Character> get_Stack(String s){
11        int n = s.length();
12        Stack<Character> st = new Stack<>();
13
14        for(int i=0 ;i<n ;i++){
15            char ch = s.charAt(i);
16            if(!st.isEmpty() && ch == '#'){
17                st.pop();
18            }
19            if(ch != '#'){
20                st.push(ch);
21            }
22        }
23
24        return st;
25    }
26}