// Last updated: 10/11/2026, 9:46:42 PM
1class Solution {
2    public int maximalRectangle(char[][] matrix) {
3        return maxRectangle(matrix);
4    }
5    public int maxRectangle(char[][] arr){
6        int n = arr.length;
7        int m = arr[0].length;
8        int ans =0;
9        int[] count = new int[m];
10        for(int i=0;i<n;i++){
11            for(int j=0 ; j<m ; j++){
12                if(arr[i][j] == '0'){
13                    count[j] = 0;
14                }else{
15                    count[j]++;
16                }
17            }
18            ans = Math.max(ans , Largest_Histogram(count));
19        }
20        return ans;
21    }
22    public int Largest_Histogram(int[] arr){
23        Stack<Integer> st = new Stack<>();
24        int ans =0;
25        for(int i=0;i<arr.length;i++){
26            while( !st.isEmpty() && arr[i]<arr[st.peek()]){
27                int  h = arr[st.pop()];
28                int r =i;
29                if(st.isEmpty()){
30                    ans = Math.max(ans, h*r);
31                }else{
32                    int l = st.peek();
33                    ans = Math.max(ans , h*(r-l-1));
34                }
35
36            }
37            st.push(i);
38        }
39        int r = arr.length;
40        while( !st.isEmpty()){
41            int  h = arr[st.pop()];
42            if(st.isEmpty()){
43                ans = Math.max(ans, h*r);
44            }else{
45                int l = st.peek();
46                ans = Math.max(ans , h*(r-l-1));
47            }
48
49        }
50        return ans;
51        
52    }
53}