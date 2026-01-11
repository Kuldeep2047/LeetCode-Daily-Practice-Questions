// Last updated: 1/11/2026, 10:21:57 PM
1class Solution {
2    public List<Integer> eventualSafeNodes(int[][] graph) {
3        List<List<Integer>> ll = new ArrayList<>();
4        for(int i=0 ;i<graph.length ;i++){
5            ll.add(new ArrayList<>());
6        }
7        
8        //find out  degree
9        int[] out = new int[graph.length];
10        for(int i=0 ;i<graph.length ;i++){
11            out[i] = graph[i].length;
12
13            //reverse graph
14            for(int v : graph[i]){
15                ll.get(v).add(i);
16            }
17        }
18
19        Queue<Integer> q = new LinkedList<>();
20        for(int i=0 ;i< graph.length ;i++){
21            if(out[i] == 0){
22                q.add(i);
23            }
24        }
25
26        List<Integer> ans = new ArrayList<>();
27        while(!q.isEmpty()){
28            int r = q.poll();
29
30            ans.add(r);
31
32            for(int nbrs : ll.get(r)){
33                out[nbrs]--;
34                if(out[nbrs] == 0){
35                    q.add(nbrs);
36                }
37            }
38        }
39        Collections.sort(ans);
40        return ans;
41    }
42}