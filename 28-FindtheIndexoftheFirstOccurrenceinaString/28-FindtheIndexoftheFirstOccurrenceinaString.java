// Last updated: 1/13/2026, 2:14:55 PM
1class Solution {
2    public int strStr(String haystack, String needle) {
3        return answer(haystack, needle);
4    }
5
6    public int answer(String s, String sub){
7        int n = s.length();
8        int m = sub.length();
9
10        // int idx =-1;
11        for(int i=0 ;i<=n - m ;i++){
12            if(sub.equals(s.substring(i,i+m))){
13                return i;
14            }
15        }
16        return -1;
17    }
18}