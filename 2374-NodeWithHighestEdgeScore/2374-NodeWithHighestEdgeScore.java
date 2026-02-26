// Last updated: 2/26/2026, 10:37:36 AM
1class Solution {
2    public int edgeScore(int[] edges) {
3        HashMap<Integer, List<Integer>> map = new HashMap<>();
4        for(int i=0; i<edges.length; i++) {
5            map.put(i, new ArrayList<>());
6        }
7            // if(!map.containsKey(edges[i])) {
8            //     map.put(edges[i], new ArrayList<>());
9            // }
10
11            // map.get(edges[i]).add(i);
12        for(int i=0 ;i<edges.length ;i++){
13            map.get(edges[i]).add(i);
14        }
15
16        long ans = 0;
17        long max = 0;
18        
19        for(int key: map.keySet()) {
20            long score = 0;
21
22            for(int val: map.get(key)){
23                score = score + val;
24            }
25            if(score>max || (score>=max && key< ans)) {
26                max = score;
27                ans = key;
28            }
29        }
30
31        return (int)ans;
32    }
33}