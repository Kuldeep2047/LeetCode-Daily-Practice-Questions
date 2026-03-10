// Last updated: 3/10/2026, 4:05:15 PM
1class Solution {
2    public int compress(char[] chars) {
3        return string_compression(chars);
4    }
5    public static int string_compression(char[] chars){
6        
7        String ans="";
8        int i=0;
9        while(i<chars.length){
10            int count=0;
11            char ch = chars[i];
12            while(i<chars.length && ch==chars[i]){
13                count++;
14                i++;
15            }
16            if(count>0){
17                ans += ch;
18                if(count>1){
19                    ans += count;
20                }
21            }
22        }
23
24        for (int j = 0; j < ans.length(); j++) {
25            chars[j] = ans.charAt(j);
26        }
27        return ans.length();
28    }
29}