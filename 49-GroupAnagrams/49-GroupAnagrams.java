// Last updated: 3/10/2026, 2:57:14 PM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        return answer(strs);
4    }
5    public List<List<String>> answer(String[] strs){
6        HashMap<String, List<String>> map = new HashMap<>();
7        for(String s : strs){
8            char[] arr = s.toCharArray();
9            Arrays.sort(arr);
10            String st = new String(arr);
11
12            if(!map.containsKey(st)){
13                map.put(st, new ArrayList<>());
14            }
15            map.get(st).add(s);
16        }
17
18        return new ArrayList<>(map.values());
19    }
20}