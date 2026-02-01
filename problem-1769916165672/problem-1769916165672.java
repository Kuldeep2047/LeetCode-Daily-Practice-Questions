// Last updated: 2/1/2026, 8:52:45 AM
1class RideSharingSystem {
2    Queue<Integer> riders;
3    Queue<Integer> drivers;
4    Set<Integer> activeRiders;
5
6    public RideSharingSystem() {
7        riders = new LinkedList<>();
8        activeRiders = new HashSet<>();
9        drivers = new LinkedList<>();
10        
11    }
12    
13    public void addRider(int riderId) {
14        
15        riders.add(riderId);
16        activeRiders.add(riderId);
17        
18    }
19    
20    public void addDriver(int driverId) {
21        drivers.add(driverId);
22    }
23    
24    public int[] matchDriverWithRider() {
25        if(!drivers.isEmpty() && !riders.isEmpty()){
26            int rId = riders.poll();
27            int dId = drivers.poll();
28            activeRiders.remove(rId);
29            return new int[]{dId, rId};
30        }
31
32        return new int[]{-1, -1};
33    }
34    
35    public void cancelRider(int riderId) {
36        if(activeRiders.contains(riderId)){
37            activeRiders.remove(riderId);
38            riders.remove(riderId);
39        }
40    }
41}
42
43/**
44 * Your RideSharingSystem object will be instantiated and called as such:
45 * RideSharingSystem obj = new RideSharingSystem();
46 * obj.addRider(riderId);
47 * obj.addDriver(driverId);
48 * int[] param_3 = obj.matchDriverWithRider();
49 * obj.cancelRider(riderId);
50 */