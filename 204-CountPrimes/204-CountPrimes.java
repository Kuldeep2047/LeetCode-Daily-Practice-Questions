// Last updated: 1/13/2026, 3:33:41 PM
1class Solution {
2    public int countPrimes(int n) {
3        if(n==0 || n==1){
4            return 0;
5        }
6        return answer(n);
7    }
8    public int answer(int n){
9        boolean[] arr = new boolean[n];
10        Arrays.fill(arr, true);
11        arr[0] = false;
12        arr[1] = false;
13
14        for(int i=2 ;i*i<=n ;i++){
15            if(arr[i] ==true){
16                for(int j=i*i ;j<n ;j+=i){
17                    arr[j] = false;
18                }
19            }
20        }
21
22        //System.out.print(Arrays.toString(arr));
23        int c =0;
24        for(int i=1 ;i<n ;i++){
25            if(arr[i] == true){
26                c++;
27            }
28        }
29        return c;
30    }
31}