// Last updated: 7/28/2026, 12:43:54 PM
1class Solution {
2    List<String> ans = new ArrayList<>();
3    public List<String> restoreIpAddresses(String s) {
4        int part =0;
5        StringBuilder sb = new StringBuilder();
6        int idx =0;
7        int n = s.length();
8        answer(idx, s, sb,  part, n);
9        return ans;
10    }
11
12    public void answer(int idx, String s, StringBuilder sb, int part, int n){
13        if(idx == n && part == 4){
14            String a  = sb.substring(0, sb.length()-1);
15            ans.add(a);
16            return;
17        }
18        if(part == 4 || idx == s.length()){
19            return;
20        }
21
22        if(idx +1 <= n){
23            int len = sb.length();
24            sb.append(s.substring(idx, idx+1)).append(".");
25            answer(idx+1, s,sb , part+1, n);
26            sb.setLength(len);
27        }
28        
29        if(idx +2 <= n && isValidPart(s.substring(idx, idx+2))){
30            int len = sb.length();
31            sb.append(s.substring(idx, idx+2)).append(".");
32            answer(idx+2, s, sb, part+1, n);
33            sb.setLength(len);
34        }
35
36        if(idx +3 <= n && isValidPart(s.substring(idx, idx+3))){
37            int len = sb.length();
38            sb.append(s.substring(idx, idx+3)).append(".");
39            answer(idx+3, s, sb, part+1, n);
40            sb.setLength(len);
41        }
42    }
43
44    public boolean isValidPart(String part){
45        if(part.charAt(0) == '0'){
46            return false;
47        }
48        int num = Integer.parseInt(part);
49        if(num > 255){
50            return false;
51        }
52        return true;
53    }
54}