// Last updated: 1/11/2026, 1:31:10 PM
1class Solution {
2    public int minDays(int[] bloomDay, int m, int k) {
3        if((long)m*k > bloomDay.length){
4            return -1;
5        }
6        return answer(bloomDay, m, k);
7    }
8
9    public int answer(int[] arr, int m, int k){
10        int max =0;
11        int min = Integer.MAX_VALUE;
12        for(int a : arr){
13            if(a>max){
14                max = a;
15            }
16            if(a<min){
17                min =a;
18            }
19        }
20        int low = min;
21        int high = max;
22        int ans = low;
23        while(low<=high){
24            int mid = (low + high) / 2;
25
26            if(isPossible(arr, m, k, mid)){
27                ans = mid;
28                high = mid-1;
29            }else{
30                low = mid+1;
31            }
32        }
33        return ans;
34    }
35
36    public boolean isPossible(int[] arr, int m ,int k, int day){
37        int c =0;
38        for(int i=0 ;i<arr.length ;i++){
39            if(arr[i] <= day){
40                c++;
41            }else{
42                int d = c/k;
43                m = m-d;
44                c=0;
45            }
46        }
47        int d = c/k;
48        m = m-d;
49        if(m<=0){
50            return true;
51        }
52        return false;
53    }
54}