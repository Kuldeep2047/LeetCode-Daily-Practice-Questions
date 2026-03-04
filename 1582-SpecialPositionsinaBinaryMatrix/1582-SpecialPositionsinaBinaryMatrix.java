// Last updated: 3/4/2026, 9:24:17 PM
1class Solution {
2    public int numSpecial(int[][] mat) {
3        return answer(mat);
4    }
5    public int answer(int[][] arr){
6        int n = arr.length;
7        int m = arr[0].length;
8        int[] r = new int[n];
9        int[] c = new int[m];
10
11        for(int i=0 ;i<n ;i++){
12            for(int j=0 ;j<m ;j++){
13                if(arr[i][j] == 1){
14                    r[i]++;
15                    c[j]++;
16                }
17            }
18        }
19        int count =0;
20        for(int i=0 ;i<n ;i++){
21            for(int j=0 ;j<m ;j++){
22                if(arr[i][j]==1 && r[i] == 1 && c[j] == 1){
23                    count++;
24                }
25            }
26        }
27
28        return count;
29
30    }
31}