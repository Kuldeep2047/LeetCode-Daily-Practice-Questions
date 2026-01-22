// Last updated: 1/22/2026, 9:42:20 PM
1class Solution {
2    public boolean isNStraightHand(int[] hand, int groupSize) {
3        return answer(hand, groupSize);
4    }
5
6    public boolean answer(int[] arr, int size){
7        if(arr.length % size != 0){
8            return false;
9        }
10        //use sorted map for frequency map ..... it sort according to key 
11        TreeMap<Integer,Integer> map = new TreeMap<>();
12        for(int a :arr){
13            map.put(a, map.getOrDefault(a, 0)+1);
14        }
15
16        while(!map.isEmpty()){
17            int curr = map.firstKey();
18
19            for(int i=0 ;i<size ;i++){
20                int ele = curr+i;
21
22                if(!map.containsKey(ele)){
23                    return false;
24                }
25
26                //decrease frequency of ele by 1
27                map.put(ele, map.get(ele)-1);
28
29                if(map.get(ele) == 0){
30                    map.remove(ele);
31                }
32            }
33
34        }
35        return true;
36    }
37}