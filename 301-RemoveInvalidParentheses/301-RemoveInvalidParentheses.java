// Last updated: 4/1/2026, 12:22:08 PM
1class Solution {
2
3    public List<String> removeInvalidParentheses(String s) {
4        return answer(s);
5    }
6
7    public List<String> answer(String s){
8        int n = s.length();
9        Set<String> visited = new HashSet<>();
10        List<String> ans = new ArrayList<>();
11        Queue<String> q = new LinkedList<>();
12
13        q.add(s);
14        visited.add(s);
15        int f = 0;
16
17        while(!q.isEmpty()){
18            String r = q.poll();
19
20            if(isValid(r)){
21                ans.add(r);
22                f = 1;
23            }
24            if(f == 1){
25                continue;
26            }
27
28            for(int i=0 ;i < r.length() ;i++){
29                char ch = r.charAt(i);
30                if(ch != '(' && ch != ')'){
31                    continue;
32                }
33
34                String newStr = r.substring(0,i) + r.substring(i+1);
35
36                if( !visited.contains(newStr)){
37                    q.add(newStr);
38                    visited.add(newStr);
39                }
40            }
41        }
42        return ans;
43    }  
44        
45
46    public boolean isValid(String sb){
47        int open = 0;
48        for(int i = 0; i < sb.length(); i++){
49            char ch = sb.charAt(i);
50            if(ch == '('){
51                open++;
52            }
53            else if(ch == ')'){
54                open--;
55            }
56
57            if(open < 0) return false;
58        }
59        return open == 0;
60    }
61}