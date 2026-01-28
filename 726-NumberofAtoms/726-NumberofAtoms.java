// Last updated: 1/28/2026, 1:00:53 PM
1class Solution {
2    public String countOfAtoms(String formula) {
3        return answer(formula);
4    }
5
6    public String answer(String s){
7        int n = s.length();
8        Stack<String> st = new Stack<>();
9
10        for(int i=0 ;i<n ;i++){
11            //if UpperCase + LowerCase + Digit
12            if(s.charAt(i) >= 'A' && s.charAt(i)<='Z'){
13                int j = i+1;
14                while(j<s.length() && isLower(s, j)){
15                    j++;
16                }
17                String curr = s.substring(i,j); //curr atom
18                st.push(curr);
19                i=j; //starting index of digit
20                //now check digit is present or not
21                while(j<s.length() && isDigit(s, j)){
22                    j++;
23                }
24                String num = s.substring(i,j);
25                if(num.length() >0){
26                    st.push(num);
27                }else{
28                    st.push("1");
29                }
30                i = j-1;
31
32            }
33
34            //open bracket
35            else if(s.charAt(i) == '('){
36                st.push("(");
37            }
38
39            //closing bracket + number(optional)
40            else{
41                //now check no. is present after closing bracket or not
42                int j = i+1;
43                while(j<s.length() && isDigit(s, j)){
44                    j++;
45                }
46                String num = s.substring(i+1, j);
47                int number = 1; // for multiply element inside the close bracket
48                if(num.length()>0){
49                    number = Integer.parseInt(num);
50                }
51                Stack<String> temp = new Stack<>();
52                while(!st.peek().equals("(")){
53                    temp.push(st.pop());
54                }
55                st.pop();//remove open bracket from main stack
56                while(!temp.isEmpty()){
57                    String atom = temp.pop();
58                    int currNum = Integer.parseInt(temp.pop());
59                    st.push(atom);
60                    st.push(String.valueOf(number * currNum));
61                }
62                i = j-1;
63                
64            }
65        }
66        //now create a TreeMap (due to sorted order)
67        TreeMap<String, Integer> map = new TreeMap<>();
68        while(!st.isEmpty()){
69            int num = Integer.parseInt(st.pop());
70            String atom = st.pop();
71            map.put(atom, map.getOrDefault(atom, 0)+num);
72        }
73
74        StringBuilder sb = new StringBuilder();
75        for(String key : map.keySet()){
76            sb.append(key);
77            if(map.get(key) != 1){
78                sb.append(map.get(key));
79            }
80        }
81        return sb.toString();
82
83    }
84
85    public boolean isLower(String s, int i){
86        char ch = s.charAt(i);
87        return ch >= 'a' && ch <= 'z';
88    }
89    public boolean isDigit(String s, int i){
90        char d = s.charAt(i);
91        return d>='0' && d<='9';
92    }
93}