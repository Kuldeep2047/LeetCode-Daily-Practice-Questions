// Last updated: 4/12/2026, 8:17:44 AM
1class Solution {
2    public double[] internalAngles(int[] sides) {
3        return answer(sides);
4    }
5    public double[] answer(int[] arr){
6        double[] ans = new double[arr.length];
7        int a = arr[0];
8        int b = arr[1];
9        int c = arr[2];
10
11        if(a+b <= c || b+c <= a || c+a <= b){
12            return new double[0];
13        }
14
15        ans[0] = angle(a,b,c);
16        ans[1] = angle(b,a,c);
17        ans[2] = angle(c,a,b);
18
19        Arrays.sort(ans);
20
21        return ans;
22    }
23
24    public double angle(double x, double y, double z){
25        double a = Math.acos((y*y + z*z - x*x) / (2*y*z));
26
27        return Math.toDegrees(a);
28    }
29}
30
31
32
33