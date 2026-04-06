// Last updated: 4/6/2026, 3:14:52 PM
1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        return Spiral_Print(matrix);
4    }
5    public List<Integer> Spiral_Print(int[][] arr){
6        int minr =0;
7        int maxr = arr.length-1;
8        int minc =0;
9        int maxc = arr[0].length-1;
10        int te = arr.length * arr[0].length;
11        int c =0;
12        List<Integer> ll = new ArrayList<>();
13        while(c<te){
14            for(int i= minc ; i<=maxc && c<te ;i++){
15                ll.add(arr[minr][i]);
16                c++;
17            }
18            minr++;
19            for(int i = minr;i<=maxr && c<te ;i++){
20                ll.add(arr[i][maxc]);
21                c++;
22            }
23            maxc--;
24            for(int i = maxc ;i>=minc && c<te ;i--){
25                ll.add(arr[maxr][i]);
26                c++;
27            }
28            maxr--;
29            for(int i = maxr ; i>=minr && c<te ;i--){
30                ll.add(arr[i][minc]);
31                c++;
32            }
33            minc++;
34        }
35        return ll;
36    }
37}