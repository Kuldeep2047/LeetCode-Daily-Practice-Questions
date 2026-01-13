// Last updated: 1/13/2026, 2:38:14 PM
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        return answer(nums);
4    }
5    public List<List<Integer>> answer(int[] arr){
6        int n = arr.length;
7        Arrays.sort(arr);
8        List<List<Integer>> ans = new ArrayList<>();
9
10        for(int i=0 ;i<n ;i++){
11            if(i>0 && arr[i] == arr[i-1]){
12                continue;
13            }
14            int si = i+1;
15            int ei = n-1;
16            
17            while(si<ei){
18                int sum = arr[i] + arr[si] + arr[ei];
19                if(sum == 0){
20                    
21                    ans.add(Arrays.asList(arr[i], arr[si], arr[ei]));
22                    si++;
23                    
24                    while(si<ei && arr[si] == arr[si-1]){
25                        si++;
26                    }
27                }
28                else if(sum <0){
29                    si++;
30                }
31                else{
32                    ei--;
33                }
34            }
35        }
36        return ans;
37    }
38}