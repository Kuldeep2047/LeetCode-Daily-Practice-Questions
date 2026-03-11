// Last updated: 3/11/2026, 11:24:24 AM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        return top_k(nums,k);
4    }
5    public static int[] top_k(int[] arr,int k){
6        HashMap<Integer, Integer> map = new HashMap<>();
7        int n = arr.length;
8        for(int i=0 ;i<n ;i++){
9            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
10        }
11        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> map.get(b) - map.get(a));
12        for(int key : map.keySet()){
13            pq.add(key);
14        }
15
16        int[] ans = new int[k];
17        for(int i=0 ;i<k ;i++){
18            ans[i] = pq.poll();
19        }
20        return ans;
21    }
22}