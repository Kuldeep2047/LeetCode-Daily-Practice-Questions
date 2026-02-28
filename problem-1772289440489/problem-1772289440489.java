// Last updated: 2/28/2026, 8:07:20 PM
1class Solution {
2    public int[] minDistinctFreqPair(int[] nums) {
3        return answer(nums);
4    }
5    public int[] answer(int[] arr){
6        int n = arr.length;
7        int[] ans = {-1,-1};
8        HashMap<Integer, Integer> map = new HashMap<>();
9        for(int a : arr){
10            map.put(a, map.getOrDefault(a,0)+1);
11        }
12        Arrays.sort(arr);
13
14        for(int i=0 ;i<n ;i++){
15            for(int j=i+1 ;j<n ;j++){
16                int a = arr[i];
17                int b = arr[j];
18                if(a < b && (map.get(a) != map.get(b)) ){
19                    return new int[]{a,b};
20                }
21            }
22        }
23        return ans;
24    }
25}