// Last updated: 1/19/2026, 2:48:24 PM
1class Solution {
2    public boolean isValid(String s) {
3        return isAnswer(s);
4    }
5    public static boolean isAnswer(String s){
6        int n = s.length();
7        Stack<Character> st = new Stack<>();
8        for(int i=0;i<n;i++){
9            char br = s.charAt(i);
10            if(br=='[' || br=='{' || br=='('){
11                st.push(br);
12            }else{
13                if(st.isEmpty()){
14                    return false;
15                }
16                char top = st.pop();
17                if((br==']' && top != '[') || (br=='}' && top != '{') || (br==')' && top != '(')){
18                    return false;
19                }
20            }
21        }
22        return st.isEmpty();
23    }
24}