// Last updated: 8/20/2026, 11:25:26 AM
1class Solution {
2    public int[] resultArray(int[] nums) {
3        return answer(nums);
4    }
5    public int[] answer(int[] arr){
6        int n = arr.length;
7        List<Integer> l1 = new ArrayList<>();
8        List<Integer> l2 = new ArrayList<>();
9        l1.add(arr[0]);
10        l2.add(arr[1]);
11
12        for(int i=2 ;i<n ;i++){
13            if(l1.get(l1.size()-1) > l2.get(l2.size()-1)){
14                l1.add(arr[i]);
15            }else{
16                l2.add(arr[i]);
17            }
18        }
19
20        int[] ans = new int[l1.size() + l2.size()];
21        int i=0;
22        for(int j = 0 ;j<l1.size() ;j++){
23            ans[i++] = l1.get(j);
24        }
25        for(int j = 0 ;j<l2.size() ;j++){
26            ans[i++] = l2.get(j);
27        }
28
29        return ans;
30    }
31}