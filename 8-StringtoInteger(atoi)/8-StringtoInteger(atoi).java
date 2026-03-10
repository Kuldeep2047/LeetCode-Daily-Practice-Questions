// Last updated: 3/10/2026, 3:47:10 PM
1class Solution {
2    public int myAtoi(String s) {
3        return answer(s);
4    }
5    public int answer(String s){
6        if(s.length() == 0){
7            return 0;
8        }
9        int n = s.length();
10        StringBuilder sb = new StringBuilder();
11        int i=0;
12        
13        while(i<n && s.charAt(i) == ' '){
14            i++;
15        }
16        
17        boolean neg = false;
18        if(i<n && (s.charAt(i) == '-' || s.charAt(i) == '+')){
19            if(s.charAt(i) == '-'){
20                neg = true;
21            }
22            i++;
23        }
24        while(i<n){
25            char ch = s.charAt(i);
26            if(Character.isDigit(ch)){
27                sb.append(ch);
28                i++;
29            }else{
30                break;
31            }
32        }
33        if(sb.length() == 0){
34            return 0;
35        }
36        long num;
37        try{
38            num = Long.parseLong(sb.toString());
39        }catch(Exception e){
40            return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
41        }
42
43        if(neg){
44            num = -1 * num;
45        }
46        if(num > Integer.MAX_VALUE){
47            return Integer.MAX_VALUE;
48        }
49        if(num < Integer.MIN_VALUE){
50            return Integer.MIN_VALUE;
51        }
52        return (int)num;
53
54    }
55    
56}