// Last updated: 2/11/2026, 6:13:56 PM
1class Solution {
2    public String maxValue(String n, int x) {
3        return answer(n,x);
4    }
5
6    public String answer(String n, int x){
7        StringBuilder sb = new StringBuilder(n);
8        char ch = (char)(x + '0');
9        if(sb.charAt(0) == '-'){
10            for(int i=1 ;i<sb.length() ;i++){
11                if(ch < sb.charAt(i)){
12                    sb.insert(i, ch);
13                    return sb.toString();
14                }
15            }
16            sb.append(ch);
17        }
18        else{
19            for(int i=0 ;i<sb.length() ;i++){
20                if(ch > sb.charAt(i)){
21                    sb.insert(i, ch);
22                    return sb.toString();
23                }
24            }
25            sb.append(ch);
26        }
27        
28
29        return sb.toString();
30    }
31}