// Last updated: 1/4/2026, 10:45:33 PM
1class Solution {
2    static class Pair{
3        int node;
4        long dist;
5        Pair(int n, long d) {
6            node = n;
7            dist = d;
8        }
9    }
10
11    public int countPaths(int n, int[][] roads) {
12        int MOD = 1_000_000_007;
13
14        List<List<Pair>> graph = new ArrayList<>();
15        for(int i = 0; i < n; i++){
16            graph.add(new ArrayList<>());
17        }
18
19        for(int[] r : roads){
20            graph.get(r[0]).add(new Pair(r[1], r[2]));
21            graph.get(r[1]).add(new Pair(r[0], r[2]));
22        }
23
24        long[] dist = new long[n];
25        Arrays.fill(dist, Long.MAX_VALUE);
26        int[] ways = new int[n];
27
28        PriorityQueue<Pair> pq = new PriorityQueue<>(
29            (a, b) -> Long.compare(a.dist, b.dist)
30        );
31
32        dist[0] = 0;
33        ways[0] = 1;
34        pq.offer(new Pair(0, 0));
35
36        while(!pq.isEmpty()){
37            Pair cur = pq.poll();
38            int u = cur.node;
39
40            if (cur.dist > dist[u]){
41                continue;
42            }
43
44            for(Pair next : graph.get(u)){
45                int v = next.node;
46                long nd = dist[u] + next.dist;
47
48                if(nd < dist[v]){
49                    dist[v] = nd;
50                    ways[v] = ways[u];
51                    pq.offer(new Pair(v, nd));
52                }
53                else if(nd == dist[v]){
54                    ways[v] = (ways[v] + ways[u]) % MOD;
55                }
56            }
57        }
58
59        return ways[n - 1];
60    }
61}