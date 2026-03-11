// Last updated: 3/11/2026, 4:03:52 PM
1class Solution {
2    public int[] findRedundantConnection(int[][] edges) {
3        return answer(edges);
4    }
5    public int[] answer(int[][] edges){
6        int n = edges.length;
7        HashMap<Integer, List<Integer>> map = new HashMap<>();
8        for(int i=1 ;i<=n ;i++){
9            map.put(i, new ArrayList<>());
10        }
11
12        for(int[] arr : edges){
13            int u = arr[0];
14            int v = arr[1];
15
16            Queue<Integer> q = new LinkedList<>();
17            HashSet<Integer> visited = new HashSet<>();
18            q.add(u);
19            while(!q.isEmpty()){
20                int r = q.poll();
21                if(visited.contains(r)){
22                    continue;
23                }
24                visited.add(r);
25                for(int nbrs : map.get(r)){
26                    if(!visited.contains(nbrs)){
27                        q.add(nbrs);
28                    }
29                }
30            }
31            if(visited.contains(v)){
32                return arr;
33            }
34
35
36            map.get(u).add(v);
37            map.get(v).add(u);
38        }
39        return new int[]{-1,-1};
40
41    }
42}