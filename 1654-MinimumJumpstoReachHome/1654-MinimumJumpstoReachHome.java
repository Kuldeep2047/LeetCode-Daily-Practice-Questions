// Last updated: 1/6/2026, 9:55:19 PM
1class Solution {
2    class Pair {
3        int pos;
4        boolean dir;
5        public Pair(int pos, boolean dir) {
6            this.pos = pos;
7            this.dir = dir;
8        }
9    }
10    public int minimumJumps(int[] forbidden, int a, int b, int x) {
11        int limit = 2000 + 2 * b + 1;
12        boolean[] visited = new boolean[limit];
13        for (int num: forbidden) {
14            visited[num] = true;
15        }
16        int step = 0;
17        Queue<Pair> q = new LinkedList<>();
18        q.add(new Pair(0, false));
19        visited[0] = true;
20        while (!q.isEmpty()) {
21            int size = q.size();
22            for (int i = 0; i < size; i++) {
23                Pair p = q.poll();
24                int pos = p.pos;
25                boolean dir = p.dir;
26              
27                if (pos == x){
28                    return step;
29                }
30                
31                if (dir==false) {
32                    int backward = pos - b;
33                  
34                    if (backward > 0 && !visited[backward]) {
35                        q.offer(new Pair(backward, true));
36                        visited[backward] = true;
37                    }
38                }
39                
40                int forward = pos + a;
41           
42                if (forward < limit && !visited[forward]) {
43                    q.offer(new Pair(forward, false));
44                    visited[forward] = true;
45                }
46              
47                
48            }
49            step++;
50        }
51        return -1;
52    }
53}