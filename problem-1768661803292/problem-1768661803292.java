// Last updated: 1/17/2026, 8:26:43 PM
1class Solution {
2    public int minOperations(int[] nums, int[] target) {
3        return answer(nums, target);
4    }
5    public int answer(int[] arr, int[] tar){
6        int n = arr.length;
7        // Map<Integer,Integer> map = new HashMap<>();
8        HashSet<Integer> set = new HashSet<>();
9
10        for(int i=0 ;i<n ;i++){
11            if(arr[i] != tar[i]){
12                set.add(arr[i]);
13                
14            }
15        }
16
17        // int ans;
18        return set.size();
19    }
20}