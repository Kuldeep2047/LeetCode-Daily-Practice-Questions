// Last updated: 3/11/2026, 2:22:17 PM
1class Solution {
2    public int shortestPathBinaryMatrix(int[][] grid) {
3        return bfs(grid);
4    }
5
6    public int bfs(int[][] grid){
7        int n = grid.length;
8        
9        if(grid[0][0] == 1 || grid[n-1][n-1] == 1){
10            return -1;
11        }
12
13        int[][] dir = {{0,1},{1,1}, {1,0}, {1,-1},{0,-1}, {-1,-1}, {-1,0}, {-1,1}};
14        Queue<int[]> q= new LinkedList<>();
15
16        boolean[][] visited = new boolean[grid.length][grid[0].length];
17        visited[0][0] = true;
18
19        q.add(new int[]{0,0,1});
20
21        while(!q.isEmpty()){
22            int[] r= q.poll();
23
24            //check destination here
25            if(r[0] == n-1 && r[1] == n-1){
26                return r[2];
27            }
28
29            //add neighbours 
30            for(int[] d : dir){
31                int cr = r[0] + d[0];
32                int cc = r[1] + d[1];
33                
34                if(cr<0 || cc<0 || cr>=n || cc>=n || visited[cr][cc] || grid[cr][cc] == 1){
35                    continue;
36                }
37                visited[cr][cc] = true;
38                q.add(new int[]{cr, cc, r[2]+1});
39            }
40        }
41        return -1;
42
43
44
45
46
47    }
48}