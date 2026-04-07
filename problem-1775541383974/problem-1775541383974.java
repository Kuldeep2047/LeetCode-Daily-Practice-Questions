// Last updated: 4/7/2026, 11:26:23 AM
1class Solution {
2    public List<Integer> findGoodIntegers(int n) {
3        return answer(n);
4    }
5
6    public List<Integer> answer(int n){
7        List<Integer> ll = new ArrayList<>();
8        Map<Integer, Integer> map = new HashMap<>();
9
10        int end = (int)Math.cbrt(n);
11        for(int i=1 ;i<= end ;i++){
12            int a = i *i*i;
13            
14            for(int j = i ; j<= end ;j++){
15                int b = j*j*j;
16                int sum = a +b ;
17
18                if(sum > n){
19                    break;
20                }
21                map.put(sum, map.getOrDefault(sum, 0)+1);
22            }
23        }
24
25        for(int key : map.keySet()){
26            if(map.get(key) >= 2){
27                ll.add(key);
28            }
29        }
30
31        Collections.sort(ll);
32
33        return ll;
34        
35    }
36}