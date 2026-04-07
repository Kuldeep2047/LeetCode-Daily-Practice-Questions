// Last updated: 4/7/2026, 2:52:40 PM
1class Solution {
2    public int firstMatchingIndex(String s) {
3        return answer(s);
4    }
5    public int answer(String s){
6        int n = s.length();
7        for(int i=0 ; i<=n/2 ;i++){
8            if(s.charAt(i) == s.charAt(n-i-1)){
9                return i;
10            }
11        }
12        return -1;
13    }
14}