// Last updated: 2/24/2026, 12:59:00 PM
1class Solution {
2    public int edgeScore(int[] edges) {
3        HashMap<Integer, List<Integer>> map = new HashMap<>();
4        for(int i=0; i<edges.length; i++) {
5            if(!map.containsKey(edges[i])) {
6                map.put(edges[i], new ArrayList<>());
7            }
8
9            map.get(edges[i]).add(i);
10        }
11
12        long ans = 0;
13        long max = 0;
14        
15        for(int key: map.keySet()) {
16            long score = 0;
17
18            for(int val: map.get(key)){
19                score = score + val;
20            }
21            if(score>max || (score==max && key< ans)) {
22                max = score;
23                ans = key;
24            }
25        }
26
27        return (int)ans;
28    }
29}