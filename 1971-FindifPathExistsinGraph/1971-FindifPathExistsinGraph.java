// Last updated: 2/23/2026, 3:37:41 PM
1class Solution {
2    HashMap<Integer, List<Integer>> graph;
3    public boolean validPath(int n, int[][] edges, int source, int destination) {
4        graph = new HashMap<>();
5        for(int i=0 ;i<n ;i++){
6            graph.put(i, new ArrayList<>());
7        }
8
9        for(int [] ed : edges){
10            int u = ed[0];
11            int v = ed[1];
12            graph.get(u).add(v);
13            graph.get(v).add(u);
14        }
15
16        return isPath(source, destination);
17    }
18
19    public boolean isPath(int src, int des){
20        Queue<Integer> q=  new LinkedList<>();
21        HashSet<Integer> visited = new HashSet<>();
22        q.add(src);
23        while(!q.isEmpty()){
24            int r = q.poll();
25
26            if(visited.contains(r)){
27                continue;
28            }
29            visited.add(r);
30
31            if(r == des){
32                return true;
33            }
34
35            for(int nbrs : graph.get(r)){
36                if(!visited.contains(nbrs)){
37                    q.add(nbrs);
38                }
39            }
40        }
41        return false;
42    }
43}