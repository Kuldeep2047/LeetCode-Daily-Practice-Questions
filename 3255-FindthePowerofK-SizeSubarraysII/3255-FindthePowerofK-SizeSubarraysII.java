// Last updated: 1/17/2026, 2:32:40 PM
1class Solution {
2    public int[] resultsArray(int[] nums, int k) {
3        return answer(nums, k);
4    }
5    //usinf Sliding_Window
6    public int[] answer(int[] arr, int k){
7        int n = arr.length;
8        int[] ans = new int[n-k+1];
9        int si =0;
10        int ei =0;
11        int idx = 0; //break point where consicutive element not found
12
13        while(ei < n){
14            if(ei>0 && arr[ei] != arr[ei-1]+1){
15                idx = ei;   //store index where consecutive oreder breaks
16            }
17            if(ei - si +1 == k){
18                if(si <idx){
19                    ans[si] = -1;
20                }else{
21                    ans[si] = arr[ei];
22                }
23                si++;
24            }
25            ei++;
26        }
27        return ans;
28    }
29
30
31    //this give TLE
32    // public int[] answer(int[] arr ,int k){
33    //     int n = arr.length;
34
35    //     int[] ans = new int[n-k+1];
36    //     for(int i=0 ;i<n-k+1 ;i++){
37            
38    //         boolean f = true;
39    //         for(int j = i+1; j<i+k ;j++){
40    //             if(arr[j] != arr[j-1] +1){
41    //                 f = false;
42    //                 break;
43    //             }
44    //         }
45    //         if(f == true){
46    //             ans[i] = arr[i+k-1];
47    //         }else{
48    //             ans[i] = -1;
49    //         }
50    //     }
51    //     return ans;
52    // }
53}