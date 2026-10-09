// Last updated: 10/9/2026, 10:36:16 AM
1class Solution {
2    public int minInsertions(String s) {
3        return insertion(s);
4    }
5    public static int insertion(String s){
6        int open =0;
7        int ans =0;
8        for(int i=0;i<s.length();i++){
9            char ch = s.charAt(i);
10            if(ch=='('){
11                open++;
12            }else{
13                if(i+1<s.length() && s.charAt(i+1)==')'){
14                    i++;
15                    
16                }else{
17                    ans++;
18                    
19                }
20                if(open>0){
21                    open--;
22                }else{
23                    ans++;
24                }
25               
26            }
27        }
28        ans += open*2;
29        
30        return ans;
31
32    }
33}