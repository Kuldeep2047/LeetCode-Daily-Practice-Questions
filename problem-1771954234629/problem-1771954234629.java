// Last updated: 2/24/2026, 11:00:34 PM
1class Solution {
2    public boolean isDigitorialPermutation(int n) {
3        int[] arr = {1,2,145, 40585};
4
5        String s = String.valueOf(n);
6
7        for(int num : arr){
8            String val = String.valueOf(num);
9            if(s.length() != val.length()){
10                continue;
11            }
12
13            if(isPer(s, val)){
14                return true;
15            }
16        }
17        return false;
18    }
19
20    public boolean isPer(String a, String b){
21        int[] freq = new int[10];
22        for(char ch : a.toCharArray()){
23            freq[ch - '0']++;
24        }
25        for(char ch : b.toCharArray()){
26            freq[ch - '0']--;
27        }
28
29        for(int c : freq){
30            if( c!= 0){
31                return false;
32            }
33        }
34        return true;
35    }
36}