// Last updated: 1/27/2026, 2:54:32 PM
1class Solution {
2    public int timeRequiredToBuy(int[] tickets, int k) {
3        return answer(tickets, k);
4    }
5    public int answer(int[] arr, int k){
6        Queue<Integer> q= new LinkedList<>();
7        for(int a : arr){
8            q.add(a);
9        }
10        int time =0;
11        int idx =0;
12        while(q.size() > 0){
13            int r = q.poll()-1;
14            if(r >=0 ){
15                time++;
16            }
17            if(r == 0 && k == idx){
18                return time;
19            }
20            q.add(r);
21
22            idx = (idx+1) % arr.length;
23
24        }
25        return time;
26    }
27}