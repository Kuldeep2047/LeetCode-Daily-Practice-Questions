// Last updated: 3/10/2026, 2:35:18 PM
1class Solution {
2    public String longestPalindrome(String s) {
3        return answer(s);
4    }
5    public String answer(String s){
6        int n = s.length();
7        int maxLen =0;
8        int start =0;
9
10        for(int axis = 0 ;axis <n ;axis++){
11            for(int orbit= 0; axis - orbit>=0 && axis + orbit <n ;orbit++){
12                if(s.charAt(axis - orbit) != s.charAt(axis + orbit)){
13                    break;
14                }
15                int len = 2 * orbit +1;
16                if(len > maxLen){
17                    maxLen = len;
18                    start = axis - orbit;
19                }
20            }
21        }
22        for(double axis = 0.5 ;axis <n ;axis++){
23            for(double orbit= 0.5; axis - orbit>=0 && axis + orbit <n ;orbit++){
24                if(s.charAt((int)(axis - orbit)) != s.charAt((int)(axis + orbit))){
25                    break;
26                }
27                int len = (int)(2 * orbit) +1;
28                if(len > maxLen){
29                    maxLen = len;
30                    start =(int) (axis - orbit);
31                }
32            }
33        }
34
35        return s.substring(start, start + maxLen);
36    }
37}