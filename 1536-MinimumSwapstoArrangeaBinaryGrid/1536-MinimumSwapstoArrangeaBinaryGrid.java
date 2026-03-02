// Last updated: 3/2/2026, 3:46:13 PM
1class Solution {
2    public int minSwaps(int[][] grid) {
3        return answer(grid);
4    }
5    public int answer(int[][] arr){
6        int n = arr.length;
7
8        int[] zero = new int[n]; //store no. of consecutive zeroes of each rows from last
9        for(int i=0 ;i<n ;i++){
10            int j = n-1;
11            int c =0;
12            while(j >=0 && arr[i][j] == 0){
13                c++;
14                j--;
15            }
16            zero[i] = c;
17        }
18        int ans =0;
19
20        for(int i=0 ;i<n ;i++){
21            int need = n - i - 1;  //(n - row - 1) => No. of required zeroes in each row
22            int j = i ;
23            while(j<n && zero[j] < need){
24                j++;
25            }
26            if(j == n){
27                return -1;
28            }
29            ans += j-i;
30            
31            //swap
32            while(j>i){
33                int temp = zero[j-1];
34                zero[j-1] = zero[j];
35                zero[j] = temp;
36                j--;
37            }
38        }
39
40        return ans;
41
42    }
43}