// Last updated: 1/12/2026, 6:45:04 PM
1class Solution {
2    public int residuePrefixes(String s) {
3        return answer(s);
4    }
5    public int answer(String s){
6        int n = s.length();
7        int  ans =0;
8        for(int i=0 ;i<n ;i++){
9            String sub = s.substring(0,i+1);
10            if(isAnswer(sub)){
11                ans++;
12            }
13        }
14        return ans;
15    }
16    public boolean isAnswer(String s){
17        HashSet<Character> set = new HashSet<>();
18        
19        for(int i=0 ;i<s.length() ;i++){
20            char ch = s.charAt(i);
21            set.add(ch);
22        }
23
24        if(set.size() == s.length()%3){
25            return true;
26        }
27        return false;
28    }
29}