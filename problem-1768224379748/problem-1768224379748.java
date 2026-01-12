// Last updated: 1/12/2026, 6:56:19 PM
1class Solution {
2    public long countPairs(String[] words) {
3        HashMap<String, Integer> map = new HashMap<>();
4
5        for(String word : words){
6            String key = normalize(word);
7            map.put(key, map.getOrDefault(key, 0) + 1);
8        }
9
10        long ans = 0;
11        for(int count : map.values()){
12            ans += (long)count * (count - 1) / 2;
13        }
14
15        return ans;
16    }
17
18    public String normalize(String s) {
19        
20        StringBuilder sb = new StringBuilder();
21        int shift = s.charAt(0) - 'a';
22
23        for(char c : s.toCharArray()){
24            char normalized = (char) ((c - shift - 'a' + 26) % 26 + 'a');
25            sb.append(normalized);
26        }
27        
28        return sb.toString();
29    }
30}