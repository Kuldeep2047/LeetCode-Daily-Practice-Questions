// Last updated: 1/17/2026, 8:18:27 PM
1class Solution {
2    public int[] bestTower(int[][] towers, int[] center, int radius) {
3        return answer(towers, center, radius);
4    }
5    public int[] answer(int[][] tower, int[] center, int r){
6        int maxq = -1;
7        // int[] ans = new int[2];
8        int cx = center[0];
9        int cy = center[1];
10        int a = -1;
11        int b =-1;
12
13        for(int[] t : tower){
14            int x = t[0];
15            int y = t[1];
16            int q = t[2];
17            int dis = Math.abs(x-cx) + Math.abs(y - cy);
18            
19            if(dis<= r){
20                if(q> maxq || (q == maxq && (x<a || (x==a && y<b)))){
21                    maxq = q;
22                    a = x;
23                    b = y;
24                }
25            }
26        }
27
28        if(maxq == -1){
29            return new int[]{-1, -1};
30        }
31        else{
32            return new int[]{a, b};
33        }
34    }
35}