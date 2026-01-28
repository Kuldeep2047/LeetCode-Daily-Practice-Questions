// Last updated: 1/28/2026, 1:04:16 PM
1class Solution {
2    public String countOfAtoms(String formula) {
3        return answer(formula);
4    }
5
6    public String answer(String s){
7        int n = s.length();
8        Stack<String> st = new Stack<>();
9
10        for(int i=0 ;i<n ;){
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
30                i = j;
31
32            }
33
34            //open bracket
35            else if(s.charAt(i) == '('){
36                st.push("(");
37                i++;
38            }
39
40            //closing bracket + number(optional)
41            else{
42                //now check no. is present after closing bracket or not
43                int j = i+1;
44                while(j<s.length() && isDigit(s, j)){
45                    j++;
46                }
47                String num = s.substring(i+1, j);
48                int number = 1; // for multiply element inside the close bracket
49                if(num.length()>0){
50                    number = Integer.parseInt(num);
51                }
52                Stack<String> temp = new Stack<>();
53                while(!st.peek().equals("(")){
54                    temp.push(st.pop());
55                }
56                st.pop();//remove open bracket from main stack
57                while(!temp.isEmpty()){
58                    String atom = temp.pop();
59                    int currNum = Integer.parseInt(temp.pop());
60                    st.push(atom);
61                    st.push(String.valueOf(number * currNum));
62                }
63                i = j;
64                
65            }
66        }
67        //now create a TreeMap (due to sorted order)
68        TreeMap<String, Integer> map = new TreeMap<>();
69        while(!st.isEmpty()){
70            int num = Integer.parseInt(st.pop());
71            String atom = st.pop();
72            map.put(atom, map.getOrDefault(atom, 0)+num);
73        }
74
75        StringBuilder sb = new StringBuilder();
76        for(String key : map.keySet()){
77            sb.append(key);
78            if(map.get(key) != 1){
79                sb.append(map.get(key));
80            }
81        }
82        return sb.toString();
83
84    }
85
86    public boolean isLower(String s, int i){
87        char ch = s.charAt(i);
88        return ch >= 'a' && ch <= 'z';
89    }
90    public boolean isDigit(String s, int i){
91        char d = s.charAt(i);
92        return d>='0' && d<='9';
93    }
94}