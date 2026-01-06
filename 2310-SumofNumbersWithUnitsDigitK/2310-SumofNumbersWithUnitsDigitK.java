// Last updated: 1/6/2026, 9:57:16 PM
1class Solution {
2    public int minimumNumbers(int num, int k) {
3        return answer(num,k);
4    }
5    public static int answer(int num,int k){
6        if(num==0){
7            return 0;
8        }
9        for(int i=1;i<=10;i++){
10            if(k*i > num){
11                return -1;
12            }
13            if((num-k*i)%10 == 0){
14                return i;
15            }
16        }
17        return -1;
18    }
19}