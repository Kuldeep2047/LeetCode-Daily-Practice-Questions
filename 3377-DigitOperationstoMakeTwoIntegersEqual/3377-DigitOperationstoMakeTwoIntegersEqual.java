// Last updated: 1/13/2026, 10:45:57 PM
1class Solution {
2    class Dijkstra{
3        int num;    //->work as vtx
4        int cost;
5        public Dijkstra(int num, int cost){
6            this.num = num;
7            this.cost = cost;
8        }
9    }
10
11    //here we use Dijkstra Algorithm
12    public int minOperations(int n, int m) {
13        //run prime sieve function first to get all the primes
14        prime_seive();
15
16        PriorityQueue<Dijkstra> pq = new PriorityQueue<>((a,b)->a.cost - b.cost);
17        HashSet<Integer> visited = new HashSet<>();
18        pq.add(new Dijkstra(n,n));
19
20        while(!pq.isEmpty()){
21            //remove
22            Dijkstra rp = pq.poll();
23            //ignore if visited
24            if(prime[rp.num] || visited.contains(rp.num)){
25                continue;
26            }
27            //mark visited
28            visited.add(rp.num);
29            //self work
30            if(rp.num == m){
31                return rp.cost;
32            }
33            //add nbrs
34            for(int nbrs : getNbrs(rp.num)){
35                if(!visited.contains(nbrs)){
36                    pq.add(new Dijkstra(nbrs, rp.cost + nbrs));
37                }
38            }
39        }
40        return -1;
41    }
42
43    public List<Integer> getNbrs(int num){
44        List<Integer> ll = new ArrayList<>();
45
46        StringBuilder sb = new StringBuilder(String.valueOf(num));
47        for(int i=0 ;i<sb.length() ;i++){
48            char ch = sb.charAt(i);
49
50            //for increment
51            if(ch < '9'){
52                char newChar = (char)(ch+1);
53                sb.setCharAt(i, newChar);
54                int number = Integer.parseInt(new String(sb));
55                if(!prime[number]){
56                    ll.add(number);
57                }
58            }
59
60            //for decrement
61            if(ch > '0'){
62                char newChar = (char)(ch-1);
63                sb.setCharAt(i, newChar);
64                int number = Integer.parseInt(new String(sb));
65                if(!prime[number]){
66                    ll.add(number);
67                }
68            }
69            sb.setCharAt(i, ch);
70        }
71        return ll;
72
73    }
74
75    boolean[] prime = new boolean[10000];
76    public void prime_seive(){
77        Arrays.fill(prime, true);
78        prime[0] = false;
79        prime[1] = false;
80        for(int i=2 ;i*i<10000 ;i++){
81            if(prime[i] == true){
82                for(int j = i*i ;j<10000 ;j+= i){
83                    prime[j] = false;
84                }
85            }
86        }
87    }
88}