// Last updated: 1/27/2026, 3:11:36 PM
1class Solution {
2    public int findTheWinner(int n, int k) {
3        List<Integer> ll = new ArrayList<>();
4        for(int i=1;i<=n;i++){
5            ll.add(i);
6        }
7        
8        int idx=0;
9        while(ll.size()>1){
10            idx = (idx+k-1)% ll.size();
11            ll.remove(idx);
12        }
13        return ll.get(0);
14        
15    }
16}