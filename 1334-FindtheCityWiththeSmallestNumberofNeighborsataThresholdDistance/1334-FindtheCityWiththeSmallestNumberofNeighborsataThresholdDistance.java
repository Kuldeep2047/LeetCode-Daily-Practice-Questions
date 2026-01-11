// Last updated: 1/11/2026, 5:55:02 PM
1class Solution {
2    class DijkstraPair {
3        int vtx;
4        int cost;
5        public DijkstraPair (int vtx, int cost){
6            this.vtx = vtx;
7            this.cost = cost;
8        }
9    }
10
11    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
12        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
13        for(int i=0 ;i<n ;i++){
14            map.put(i, new HashMap<>());
15        }
16        for(int[] e : edges){
17            map.get(e[0]).put(e[1],e[2]);
18            map.get(e[1]).put(e[0],e[2]);
19        }
20        
21        int city =-1;
22        int minCount = Integer.MAX_VALUE;
23
24        for(int src=0; src<n ;src++){
25            PriorityQueue<DijkstraPair> pq = new PriorityQueue<>((a,b)-> a.cost - b.cost);
26            int[] dis = new int[n];
27            Arrays.fill(dis, 999999);
28            dis[src] = 0;
29            pq.add(new DijkstraPair(src, 0));
30
31            while(!pq.isEmpty()){
32                DijkstraPair rp = pq.poll();
33
34                if(rp.cost > dis[rp.vtx]){
35                    continue;
36                }
37
38                for(int nbrs : map.get(rp.vtx).keySet()){
39                    int newCost = rp.cost + map.get(rp.vtx).get(nbrs);
40
41                    if(newCost < dis[nbrs]){
42                        dis[nbrs] = newCost;
43                        pq.add(new DijkstraPair(nbrs, newCost) );
44                    }
45                }
46            }
47
48            int count = 0;
49            for(int i=0 ;i<n ;i++){
50                if(i!= src && dis[i]<=distanceThreshold){
51                    count++;
52                }
53            }
54
55            if(count < minCount){
56                minCount = count;
57                city = src;
58            }
59            if(count == minCount && src>city){
60                minCount = count;
61                city = src;
62            }
63        }
64        return city;  
65    }
66}