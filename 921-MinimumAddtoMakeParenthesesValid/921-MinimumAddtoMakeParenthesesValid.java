// Last updated: 10/6/2026, 10:19:32 PM
1class Solution {
2    public int minAddToMakeValid(String s) {
3        return Min_Parentheses(s);
4    }
5    public static int Min_Parentheses(String s){
6        int open=0;
7        int close=0;
8        for(int i=0;i<s.length();i++){
9            char bracket = s.charAt(i);
10            if(bracket=='('){
11                open++;
12            }else if(bracket==')'){
13                if(open>0){
14                    open--;
15                }else{
16                    close++;
17                }
18            }
19        }
20        return open+close;
21    }
22}