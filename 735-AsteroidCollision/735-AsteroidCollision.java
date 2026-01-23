// Last updated: 1/23/2026, 3:01:20 PM
1class Solution {
2    public int[] asteroidCollision(int[] asteroids) {
3        return answer(asteroids);
4    }
5
6    public int[] answer(int[] arr){
7        Stack<Integer> st = new Stack<>();
8        int n = arr.length;
9        for(int i=0 ;i<n ;i++){
10            if(arr[i] > 0){
11                st.push(arr[i]);
12            }
13            else{
14                while(!st.isEmpty() && st.peek()>0 && st.peek() < Math.abs(arr[i])){
15                    st.pop();
16                }
17
18                if(!st.isEmpty() && st.peek() == Math.abs(arr[i])){
19                    st.pop();
20                }
21                else if(st.isEmpty() || st.peek()<0){
22                    st.push(arr[i]);
23                }
24            }    
25        }
26        int[] ans = new int[st.size()];
27        int c =0;
28        for(int a : st){
29            ans[c++] = a;
30        }
31        return ans;
32    }
33}