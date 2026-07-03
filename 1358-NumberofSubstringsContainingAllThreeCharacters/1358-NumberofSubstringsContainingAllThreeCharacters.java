// Last updated: 7/3/2026, 9:20:01 AM
1class Solution {
2    public int numberOfSubstrings(String s) {
3        return substring(s);
4    }
5    public static int substring(String s){
6        int si=0,ei=0;
7        int ans=0;
8        int a=0,b=0,c=0;
9        while(ei<s.length()){
10            char ch = s.charAt(ei);
11            if(ch=='a'){
12                a++;
13            }
14            else if(ch=='b'){
15                b++;
16            }
17            else{
18                c++;
19            }
20            while(a>0 && b>0 && c>0){
21                ans += s.length()-ei;
22                char chr = s.charAt(si);
23                if(chr=='a'){
24                    a--;
25                }
26                else if(chr=='b'){
27                    b--;
28                }
29                else{
30                    c--;
31                }
32                si++;
33            }
34            ei++;
35        }
36        return ans;
37    }
38}