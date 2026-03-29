// Last updated: 3/29/2026, 10:17:45 PM
1class Solution {
2    public boolean canBeEqual(String s1, String s2) {
3        char[] even1 = {s1.charAt(0), s1.charAt(2)};
4        char[] even2 = {s2.charAt(0), s2.charAt(2)};
5        char[] odd1 = {s1.charAt(1), s1.charAt(3)};
6        char[] odd2 = {s2.charAt(1), s2.charAt(3)};
7
8        Arrays.sort(even1); 
9        Arrays.sort(even2);
10        Arrays.sort(odd1); 
11        Arrays.sort(odd2);
12
13        return Arrays.equals(even1, even2) && Arrays.equals(odd1, odd2);
14    }
15}