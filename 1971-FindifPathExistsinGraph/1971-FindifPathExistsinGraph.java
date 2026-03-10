// Last updated: 3/10/2026, 10:30:16 AM
1class Solution {
2    public boolean validPath(int n, int[][] edges, int source, int destination) {
3        HashMap<Integer, List<Integer>> map = new HashMap<>();
4        for(int i=0 ;i<n ;i++){
5            map.put(i, new ArrayList<>());
6        }
7        for(int[] arr : edges){
8            int u = arr[0];
9            int v = arr[1];
10            map.get(u).add(v);
11            map.get(v).add(u);
12        }
13
14        return answer(source, destination, map);
15    }
16    public boolean answer(int src, int des, HashMap<Integer, List<Integer>> map){
17        Queue<Integer> q= new LinkedList<>();
18        HashSet<Integer> visited= new HashSet<>();
19        q.add(src);
20        while(!q.isEmpty()){
21            int r = q.poll();
22
23            if(visited.contains(r)){
24                continue;
25            }
26
27            visited.add(r);
28
29            if(r == des){
30                return true;
31            }
32
33            for(int nbrs : map.get(r)){
34                if(!visited.contains(nbrs)){
35                    q.add(nbrs);
36                }
37            }
38        }
39        return false;
40    }
41}