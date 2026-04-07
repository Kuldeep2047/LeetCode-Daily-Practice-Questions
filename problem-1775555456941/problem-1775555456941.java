// Last updated: 4/7/2026, 3:20:56 PM
1class EventManager {
2    PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
3        if(a[1] != b[1]){
4            return b[1] - a[1];
5        }else{
6            return a[0] - b[0];
7        }
8    });
9    HashMap<Integer, Integer> map = new HashMap<>();
10    
11    public EventManager(int[][] events) {
12        for(int[] arr : events){
13            int id = arr[0];
14            int pr = arr[1];
15            pq.add(new int[] {id, pr});
16            map.put(id, pr);
17        }
18    }
19    
20    public void updatePriority(int eventId, int newPriority) {
21        pq.add(new int[] {eventId, newPriority});
22        map.put(eventId, newPriority);
23        
24    }
25    
26    public int pollHighest() {
27        while(!pq.isEmpty()){
28            int[] r = pq.poll();
29            int id = r[0];
30            int p = r[1];
31
32            if(map.containsKey(id) && map.get(id) == p){
33                map.remove(id);
34                return id;
35                
36            }
37        }
38        
39        return -1;
40    }
41}
42
43/**
44 * Your EventManager object will be instantiated and called as such:
45 * EventManager obj = new EventManager(events);
46 * obj.updatePriority(eventId,newPriority);
47 * int param_2 = obj.pollHighest();
48 */