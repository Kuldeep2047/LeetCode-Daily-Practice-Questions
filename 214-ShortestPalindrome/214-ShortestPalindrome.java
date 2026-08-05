// Last updated: 8/5/2026, 1:14:14 PM
1class Solution {
2    public String shortestPalindrome(String s) {
3        return answer(s);
4    }
5    public static String answer(String s){
6        int n = s.length();
7        int i=0;
8        for(int j=n-1;j>=0;j--){
9            if(s.charAt(i) == s.charAt(j)){
10                i++;
11            }
12        }
13        if(i==n){
14            return s;
15        }
16
17       
18        StringBuilder start = new StringBuilder(s.substring(i,n));
19        start.reverse().toString();
20
21
22        return start + answer(s.substring(0,i))+s.substring(i);
23    }
24}