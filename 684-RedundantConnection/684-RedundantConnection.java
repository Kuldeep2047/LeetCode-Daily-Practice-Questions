// Last updated: 2/27/2026, 2:56:26 PM
1class Solution {
2    public int[] findRedundantConnection(int[][] edges) {
3        int n = edges.length;
4        HashMap<Integer, List<Integer>> map = new HashMap<>();
5        for(int i=1 ;i<=n ;i++){
6            map.put(i, new ArrayList<>());
7        }
8
9        for(int[] arr : edges){
10            int u = arr[0];
11            int v = arr[1];
12
13            Queue<Integer> q = new LinkedList<>();
14            HashSet<Integer> visited = new HashSet<>();
15            q.add(u);
16
17            while(!q.isEmpty()){
18                int r = q.poll();
19                if(visited.contains(r)){
20                    continue;
21                }
22                visited.add(r);
23
24                for(int nbrs : map.get(r)){
25                    if(!visited.contains(nbrs)){
26                        q.add(nbrs);
27                    }
28                }
29            }
30
31            if(visited.contains(v)){
32                return arr;
33            }
34
35            map.get(u).add(v);
36            map.get(v).add(u);
37        }
38        return new int[]{-1,-1};
39    }
40}