// Last updated: 1/4/2026, 10:00:01 PM
1class Solution {
2    public int maxRepeating(String sequence, String word) {
3        int k = 0;
4        String temp = word;
5
6        while(sequence.contains(temp)){
7            
8            temp += word;
9            k++;
10        }
11
12        return k;
13    }
14}