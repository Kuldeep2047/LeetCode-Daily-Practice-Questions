// Last updated: 3/1/2026, 11:52:46 AM
1class Solution {
2    public int minPartitions(String n) {
3        return Partition(n);
4    }
5
6    public static int Partition(String n){
7        int max=Integer.MIN_VALUE;
8        for(int i=0;i<n.length();i++){
9            if(n.charAt(i)-'0'>max){
10                max = n.charAt(i)-'0';
11            }
12        }
13        return max;
14    }
15}