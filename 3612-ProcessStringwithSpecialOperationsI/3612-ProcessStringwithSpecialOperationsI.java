// Last updated: 6/16/2026, 10:55:24 PM
1class Solution {
2    public String processStr(String s) {
3        StringBuilder ans = new StringBuilder();
4        for(char ch : s.toCharArray()) {
5            if(ch == '*' && ans.length() >= 1) {
6                ans.deleteCharAt(ans.length() - 1);
7            }
8            else if(ch == '#' && ans.length() >= 1) {
9                String temp = ans.toString();
10                ans.append(temp);
11            }
12            else if(ch == '%') {
13                ans.reverse();
14            }
15            if(ch >= 'a' && ch <= 'z') {
16                ans.append(ch);
17            }
18        }
19        return ans.toString();
20    }
21}