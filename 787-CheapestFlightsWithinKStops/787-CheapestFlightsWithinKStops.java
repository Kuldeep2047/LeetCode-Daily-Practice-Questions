// Last updated: 3/16/2026, 4:30:28 PM
1class Solution {
2
3    class DijkstraPair {
4        int city;
5        int cost;
6        int stop;
7
8        public DijkstraPair(int city, int cost, int stop){
9            this.city = city;
10            this.cost = cost;
11            this.stop = stop;
12        }
13    }
14
15    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
16
17        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
18
19        for(int i = 0; i < n; i++){
20            map.put(i, new HashMap<>());
21        }
22
23        for(int[] f : flights){
24            map.get(f[0]).put(f[1], f[2]);
25        }
26
27        PriorityQueue<DijkstraPair> pq =
28                new PriorityQueue<>((a,b) -> a.cost - b.cost);
29
30        pq.add(new DijkstraPair(src,0,0));
31
32        int[] stops = new int[n];
33        Arrays.fill(stops, Integer.MAX_VALUE);
34
35        while(!pq.isEmpty()){
36
37            DijkstraPair r = pq.poll();
38
39            int city = r.city;
40            int cost = r.cost;
41            int stop = r.stop;
42
43            if(city == dst){
44                return cost;
45            }
46
47            if(stop > k || stop > stops[city]){
48                continue;
49            }
50
51            stops[city] = stop;
52
53            for(int nbr : map.get(city).keySet()){
54
55                int newCost = cost + map.get(city).get(nbr);
56
57                pq.add(new DijkstraPair(nbr, newCost, stop + 1));
58            }
59        }
60
61        return -1;
62    }
63}