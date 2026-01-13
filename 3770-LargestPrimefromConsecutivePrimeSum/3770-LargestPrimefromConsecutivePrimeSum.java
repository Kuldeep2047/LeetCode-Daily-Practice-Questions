// Last updated: 1/13/2026, 9:41:20 PM
1class Solution {
2    public int largestPrime(int n) {
3        return answer(n);
4    }
5
6    public int answer(int n){
7        boolean[] arr = new boolean[n+1];
8        Arrays.fill(arr, true);
9        arr[0] = false;
10        arr[1] = false;
11
12        for(int i=2 ;i*i<=n ;i++){
13            if(arr[i] == true){
14                for(int j=i*i ;j<=n ;j+= i){
15                    arr[j] = false;
16                }
17            }
18        }
19
20        int ans =0;
21        int sum =0;
22        for(int i=2 ;i<=n && sum<=n;i++){
23            if(arr[i] == true ){//if i prime hai to
24                sum += i;
25                if(sum <= n && arr[sum]== true){
26                    ans = sum;
27                }
28            }
29        }
30        return ans;
31
32    }
33}