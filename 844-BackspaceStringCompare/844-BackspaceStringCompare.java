// Last updated: 1/20/2026, 2:32:38 PM
1class Solution {
2    public boolean backspaceCompare(String s, String t) {
3        Stack<Character> s1  = Backspace_len(s);
4        Stack<Character> s2 = Backspace_len(t);
5        return s1.equals(s2);
6    }
7    public static Stack<Character> Backspace_len(String s){
8        int n = s.length();
9        Stack<Character> st = new Stack<>();
10        for(int i=0;i<n;i++){
11            char ch = s.charAt(i);
12            if(!st.isEmpty() && ch == '#'){
13                st.pop();
14            }else if(ch != '#'){
15                st.push(ch);
16            }
17        }
18        return st;
19    }
20}