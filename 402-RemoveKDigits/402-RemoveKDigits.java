// Last updated: 1/22/2026, 10:55:26 PM
1class Solution {
2    public String removeKdigits(String num, int k) {
3        return remove_digits(num, k);
4    }
5    public static String remove_digits(String num, int k){
6        Stack<Character> st = new Stack<>();
7        for(int i=0;i<num.length() ;i++){
8            char ch = num.charAt(i);
9
10            while(!st.isEmpty() && k>0 && (ch-'0' < st.peek()-'0')){
11                st.pop();
12                k--;
13            }
14            st.push(ch);
15        }
16        while(k>0){
17            st.pop();
18            k--;
19        }
20        if(st.isEmpty()){
21            return "0";
22        }
23
24        StringBuilder sb = new StringBuilder();
25
26        while(!st.isEmpty()){
27            sb.insert(0, st.pop());
28        }
29        while (sb.length() > 1 && sb.charAt(0) == '0') {
30            sb.deleteCharAt(0);
31        }
32
33        return sb.toString();
34
35    }
36}