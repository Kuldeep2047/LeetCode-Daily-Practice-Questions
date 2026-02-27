// Last updated: 2/27/2026, 2:07:55 PM
1class Solution {
2    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
3        int n = rooms.size();
4        HashMap<Integer, List<Integer>> map = new HashMap<>();
5        for(int i=0 ;i<n ;i++){
6            int u = i;
7            List<Integer> v = rooms.get(i);
8            map.put(u, v);
9        }
10        Queue<Integer> q = new LinkedList<>();
11        HashSet<Integer> visited = new HashSet<>();
12        q.add(0);
13        while(!q.isEmpty()){
14            int r = q.poll();
15            if(visited.contains(r)){
16                continue;
17            }
18            visited.add(r);
19            for(int nbrs : map.get(r)){
20                if(!visited.contains(nbrs)){
21                    q.add(nbrs);
22                }
23            }
24        }
25
26        return visited.size() == n;
27
28    }
29}