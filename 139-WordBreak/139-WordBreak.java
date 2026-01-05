// Last updated: 1/5/2026, 1:15:15 PM
1class Solution {
2    HashMap<String , Boolean> map = new HashMap<>();
3    public boolean wordBreak(String s, List<String> wordDict) {
4        HashSet<String> set = new HashSet<>();
5        for(String str: wordDict){
6            set.add(str);
7        }
8        return answer(s, set);
9
10    }
11    public boolean answer(String s, HashSet<String> set){
12        if(s.length() == 0){
13            return true;
14        }
15
16        if(map.containsKey(s)){
17            return map.get(s);
18        }
19        for(int cut = 1 ;cut<=s.length() ;cut++){
20            String sub = s.substring(0,cut);
21            if(set.contains(sub)){
22                boolean ans = answer(s.substring(cut), set);
23                
24                if(ans){
25                    map.put(s, true);
26                    return true;
27                    
28                }
29
30            }
31        }
32        map.put(s, false);
33
34        return false;
35    }
36}