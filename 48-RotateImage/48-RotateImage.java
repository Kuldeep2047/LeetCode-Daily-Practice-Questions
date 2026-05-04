// Last updated: 5/4/2026, 9:41:57 PM
1class Solution {
2    public void rotate(int[][] matrix) {
3        answer(matrix);
4    }
5    public void answer(int[][] arr){
6        int n = arr.length;
7
8        //ab transpose karo
9        for(int i=0;i<n;i++){
10            for(int j=i+1;j<n;j++){
11                if(i<j){
12                    int t = arr[i][j];
13                    arr[i][j] = arr[j][i];
14                    arr[j][i] = t;
15                }
16            }
17        }
18        //column revrse karo phele
19        for(int i = 0 ;i<n;i++){
20            int si = 0;
21            int ei = n-1;
22            while(si<ei){
23                int t = arr[i][si];
24                arr[i][si] = arr[i][ei];
25                arr[i][ei] = t;
26                si++;
27                ei--;
28
29            }
30        }
31
32        
33     
34    }
35}