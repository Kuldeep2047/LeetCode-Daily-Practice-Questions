// Last updated: 6/21/2026, 10:48:10 AM
1class Solution {
2    public int maxIceCream(int[] costs, int coins) {
3        Arrays.sort(costs);
4        int sum=0;
5        int c=0;
6        for(int i=0;i<costs.length;i++){
7            sum+=costs[i];
8            if(sum>coins){
9                break;
10            }
11            c++;
12        }
13        return c;
14        
15    }
16}