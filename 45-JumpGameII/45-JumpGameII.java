// Last updated: 5/14/2026, 10:33:02 PM
1class Solution {
2    public boolean canReach(int[] arr, int start) {
3        boolean[] visited = new boolean[arr.length];
4        return answer(arr, start, visited);
5    }
6    public boolean answer(int[] arr, int idx, boolean[] visited){
7        if(idx < 0 || idx >= arr.length){
8            return false;
9        }
10        if(visited[idx] == true){
11            return false;
12        }
13        if(arr[idx] == 0){
14            return true;
15        }
16        
17        visited[idx] = true;
18        boolean a = answer(arr, idx + arr[idx], visited);
19        boolean b = answer(arr, idx - arr[idx], visited);
20
21        return a || b;
22    }
23}