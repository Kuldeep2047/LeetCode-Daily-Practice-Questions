// Last updated: 1/30/2026, 11:49:04 AM
1class Solution {
2    public int[] deckRevealedIncreasing(int[] deck) {
3        return answer(deck);
4    }
5    public int[] answer(int[] arr){
6        int n = arr.length;
7        int[] ans = new int[n];
8        Arrays.sort(arr);
9        Queue<Integer> q= new LinkedList<>();
10        for(int i=0 ;i<n ;i++){
11            q.add(i);
12        }
13
14        for(int val : arr){
15            int idx = q.poll();
16            ans[idx] = val;
17
18            if(!q.isEmpty()){
19                q.add(q.poll());
20            }
21        }
22        return ans;
23
24    }
25}