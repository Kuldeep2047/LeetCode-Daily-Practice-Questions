// Last updated: 4/6/2026, 3:15:46 PM
1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        return answer(matrix);
4    }
5
6    public List<Integer> answer(int[][] arr){
7        int n = arr.length;
8        int m = arr[0].length;
9        List<Integer> ll = new ArrayList<>();
10        int te = n * m;
11        int c =0;
12
13        int minr = 0;
14        int maxr = n-1;
15        int minc = 0;
16        int maxc = m-1;
17        while(c < te){
18            for(int i = minc ; i<=maxc && c < te ; i++){
19                ll.add(arr[minr][i]);
20                c++;
21            }
22            minr++;
23
24            for(int i = minr ;i<= maxr && c < te;i++){
25                ll.add(arr[i][maxc]);
26                c++;
27            }
28            maxc--;
29
30            for(int i = maxc ; i>= minc && c < te ;i--){
31                ll.add(arr[maxr][i]);
32                c++;
33            }
34            maxr--;
35
36            for(int i = maxr ; i >= minr && c < te ;i--){
37                ll.add(arr[i][minc]);
38                c++;
39            }
40            minc++;
41        }
42        return ll;
43
44    }
45
46
47}