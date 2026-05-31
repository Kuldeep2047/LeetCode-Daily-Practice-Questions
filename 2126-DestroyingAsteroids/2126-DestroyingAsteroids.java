// Last updated: 5/31/2026, 12:03:10 PM
1class Solution {
2    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
3        return answer(mass, asteroids);
4    }
5    public boolean answer(int mass, int[] arr){
6        int n = arr.length;
7        long sum =mass;
8        Arrays.sort(arr);
9
10        for(int m : arr){
11            if(sum < m){
12                return false;
13            }
14            sum += m;
15        }
16        return true;
17    }
18}