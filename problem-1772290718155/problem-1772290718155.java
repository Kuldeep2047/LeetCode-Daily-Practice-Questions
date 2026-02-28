// Last updated: 2/28/2026, 8:28:38 PM
1class Solution {
2    public String mergeCharacters(String s, int k) {
3        return answer(s, k);
4    }
5
6    public String answer(String s, int k){
7        
8        StringBuilder sb = new StringBuilder(s);
9
10        while(true){
11            // int n = s.length();
12            int n = sb.length();
13            int f = 0;
14            // boolean m = false;
15            for(int i=0 ;i<n ;i++){
16                for(int j=i+1 ;j<n ;j++){
17                    if((j-i) <= k && sb.charAt(i) == sb.charAt(j)){
18                        sb.deleteCharAt(j);
19    
20                        f = 1;
21                        break;
22                    }
23                }
24                if(f == 1){
25                    break;
26                }
27            }
28    
29            if(f == 0){
30                break;
31            }
32        }
33
34        return sb.toString();
35    }
36}