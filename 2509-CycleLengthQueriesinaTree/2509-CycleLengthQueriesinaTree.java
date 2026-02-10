// Last updated: 2/10/2026, 10:10:49 PM
1class Solution {
2    public int[] cycleLengthQueries(int n, int[][] queries) {
3        return answer(n, queries);
4    }
5    public int[] answer(int n, int[][] queries){
6        int[] ans = new int[queries.length];
7
8        // int ans =0;
9        int i=0;
10        for(int[] arr : queries){
11            int a = arr[0];
12            int b = arr[1];
13
14            int c =0;
15            while(a != b){
16                if(a > b){
17                    a = a /2;
18                }
19                else{
20                    b = b/2;
21                }
22                c++;
23            }
24            ans[i++] = c+1;
25        }
26
27        return ans;
28    }
29}