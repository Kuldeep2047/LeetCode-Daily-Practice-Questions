// Last updated: 3/9/2026, 3:35:41 PM
1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3        return Anagrams(s,p);
4    }
5    public static List<Integer> Anagrams(String s , String p){
6        int n = s.length();
7        int m = p.length();
8        List<Integer> ll = new ArrayList<>();
9        
10        int[] freq = new int[26];
11        for(int i=0 ;i<m ;i++){
12            freq[p.charAt(i) - 'a']++;
13        }
14
15        int si =0;
16        int ei = 0;
17        while(ei < n){
18            freq[s.charAt(ei)-'a']--;
19
20            while(ei -si +1 == m && si<n){
21                if(isAns(freq)){
22                    ll.add(si);
23                }
24                freq[s.charAt(si)-'a']++;
25                si++;
26            }
27            ei++;
28        }
29        return ll;
30
31    }
32
33    public static boolean isAns(int[] arr){
34        for(int a:arr){
35            if(a != 0){
36                return false;
37            }
38        }
39        return true;
40    }
41}