// Last updated: 1/5/2026, 3:37:27 PM
1class Solution {
2    public int findNumberOfLIS(int[] nums) {
3        return answer(nums);
4    }
5
6    public int answer(int[] arr){
7        int n = arr.length;
8        int[] dp = new int[n];
9        int[] count = new int[n];
10        Arrays.fill(dp ,1);
11        Arrays.fill(count, 1);
12        int max =1;
13
14    
15        for(int i=0 ;i<n ;i++){
16            for(int j = i-1 ;j>=0 ;j--){
17                if(arr[i]>arr[j]){
18                    if(dp[j] +1 > dp[i]){
19                        dp[i] = dp[j] +1;
20                        count[i] = count[j];
21                    }
22                    else if(dp[i] == dp[j]+1){
23                        count[i] += count[j];
24                    } 
25                    max = Math.max(max, dp[i]);                  
26                    
27                }                
28            }
29            
30        }
31        
32        int c =0;
33        for(int i=0 ;i<n ;i++){
34            if(dp[i] == max){
35                c += count[i];
36            }
37        }
38        return c;
39    }
40}