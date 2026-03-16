// Last updated: 3/16/2026, 2:46:44 PM
1class Solution {
2    public int networkDelayTime(int[][] times, int n, int k) {
3        return answer(times, n, k);
4    }
5    class DijkstraPair {
6		int vtx;
7		int cost;
8
9		public DijkstraPair(int vtx, int cost) {
10			// TODO Auto-generated constructor stub
11			this.vtx = vtx;
12			this.cost = cost;
13		}
14
15		
16	}
17    public HashMap<Integer, Integer> Dijkstra(HashMap<Integer, HashMap<Integer, Integer>> map, int k, HashMap<Integer, Integer> find){
18		PriorityQueue<DijkstraPair> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);
19		HashSet<Integer> visited = new HashSet<>();
20		pq.add(new DijkstraPair(k, 0));
21		while (!pq.isEmpty()) {
22			
23			DijkstraPair rp = pq.poll();
24			
25			if (visited.contains(rp.vtx)) {
26				continue;
27			}
28			
29			visited.add(rp.vtx);
30
31            find.put(rp.vtx, rp.cost);
32			
33			for (int nbrs : map.get(rp.vtx).keySet()) {
34				if (!visited.contains(nbrs)) {
35					int cost = map.get(rp.vtx).get(nbrs);
36					pq.add(new DijkstraPair(nbrs,  rp.cost + cost));
37				}
38			}
39		}
40
41        return find;
42	}
43
44    public int answer(int[][] times, int n, int k){
45        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
46        for(int i=1 ;i<=n ;i++){
47            map.put(i, new HashMap<>());
48        }
49
50        for(int i=0 ;i<times.length ;i++){
51            map.get(times[i][0]).put(times[i][1], times[i][2]);
52        }
53
54        HashMap<Integer, Integer> find = new HashMap<>();
55        Dijkstra(map, k, find);
56
57        if(find.size() < n){
58            return -1;
59        }
60        int max = Integer.MIN_VALUE;
61        for(int key: find.keySet()) {
62            max = Math.max(find.get(key), max);
63        }
64        return max;
65
66    }
67}