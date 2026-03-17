// Last updated: 3/17/2026, 12:45:56 PM
1class Solution {
2    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
3        List<List<double[]>> adj = new ArrayList<>();
4        for(int i = 0; i < n; i++){
5            adj.add(new ArrayList<>());
6        }
7
8        for (int i = 0; i < edges.length; i++) {
9            int u = edges[i][0];
10            int v = edges[i][1];
11            adj.get(u).add(new double[]{v, succProb[i]});
12            adj.get(v).add(new double[]{u, succProb[i]});
13        }
14
15        double[] dis = new double[n];
16        Arrays.fill(dis, 0.0);
17        dis[start_node] = 1.0;
18
19        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[1], a[1]));
20        pq.add(new double[]{start_node, 1.0});
21
22        while (!pq.isEmpty()) {
23            double[] cur = pq.poll();
24            int node = (int) cur[0];
25            double d = cur[1];
26
27            if(dis[node] > d){
28                continue;
29            }
30
31            for(double[] nbr : adj.get(node)){
32                int next = (int) nbr[0];
33                double wt = nbr[1];
34
35                if(d * wt > dis[next]){
36                    dis[next] = d * wt;
37                    pq.add(new double[]{next, dis[next]});
38                }
39            }
40
41        }
42        return dis[end_node] == Double.MIN_VALUE ? 1 : dis[end_node];
43    }
44}