// Last updated: 1/29/2026, 11:00:28 PM
1class Solution {
2    public int tupleSameProduct(int[] nums) {
3        return answer(nums);
4    }
5    public int answer(int[] arr){
6        int n = arr.length;
7        Map<Integer, Integer> map = new HashMap<>();
8
9        for(int i=0 ;i<n ;i++){
10            for(int j=i+1 ;j<n ;j++){
11                int p = arr[i]*arr[j];
12                map.put(p, map.getOrDefault(p,0)+1);
13            }
14        }
15
16        int ans =0;
17        for(int key : map.keySet()){
18            int v = map.get(key);
19            if(v >= 2){
20                ans += (v* (v-1)/2) * 8;
21            }
22        }
23        return ans;
24    }
25}