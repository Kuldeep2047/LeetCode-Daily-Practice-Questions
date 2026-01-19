// Last updated: 1/19/2026, 2:49:07 PM
1class Solution {
2    public boolean isValid(String s) {
3        return answer(s);
4    }
5    public static boolean answer(String s){
6        int n = s.length();
7        Stack<Character> st = new Stack<>();
8        for(int i=0 ;i<n ;i++){
9            char br = s.charAt(i);
10            if(br == '[' || br == '{' || br == '('){
11                st.push(br);
12            }
13            else{
14                if(st.isEmpty()){
15                    return false;
16                }
17                char top = st.pop();
18                if((br == ']' && top != '[') || (br == '}' && top != '{') || (br == ')' && top != '(') ){
19                    return false;
20                }
21            }
22        }
23        return st.isEmpty();
24
25    }
26}