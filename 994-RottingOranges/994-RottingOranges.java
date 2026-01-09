// Last updated: 1/9/2026, 4:49:54 PM
1class Solution {
2    public int orangesRotting(int[][] grid) {
3        return answer(grid);
4    }
5
6    public int answer(int[][] arr){
7        int n = arr.length;
8        int m = arr[0].length;
9        int fresh =0;
10        Queue<int[]> q = new LinkedList<>();
11
12        for(int i=0; i<n ;i++){
13            for(int j=0 ;j<m ;j++){
14                if(arr[i][j] == 2){
15                    q.add(new int[]{i, j});
16                }
17                else if(arr[i][j] == 1){
18                    fresh++;
19                }
20            }
21        }
22        if(fresh == 0){
23            return 0;
24        }
25
26        int[][] dir = {{1, 0},{0, -1},{-1, 0},{0, 1}}; 
27        int time=0;
28        //BFS
29        while(!q.isEmpty()){
30            int s = q.size();
31            for(int i=0 ;i<s ;i++){
32                int[] r = q.poll();
33                for(int[] d : dir){
34                    int cr = r[0] + d[0];
35                    int cc = r[1] + d[1];
36                    if(cr>=0 && cc>=0 && cr<n && cc<m && arr[cr][cc] == 1){
37                        arr[cr][cc] = 2;
38                        fresh--;
39                        q.add(new int[]{cr, cc});
40                    }
41                }
42            }
43            time++;
44        }
45        if(fresh == 0){
46            return time -1;
47        }
48        return -1;
49    }
50}