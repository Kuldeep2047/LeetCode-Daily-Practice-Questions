// Last updated: 1/19/2026, 3:59:48 PM
1class Solution {
2    public int calPoints(String[] operations) {
3        return Baseball_Game(operations);
4    }
5    public static int Baseball_Game(String[] operations){
6        Stack<Integer> st = new Stack<>();
7        int sum=0;
8        for(int i=0;i<operations.length;i++){
9            String ele   = operations[i];
10            if (ele.equals("+")) {
11                int a = st.pop();
12                int b = st.pop();
13                st.push(b);
14                st.push(a);
15                st.push(a + b);
16            } else if(ele.equals("D")){
17                st.push(2*st.peek());
18            }else if(ele.equals("C")){
19                st.pop();
20            }else{
21                st.push(Integer.parseInt(ele));
22            }
23
24        }
25        while(!st.isEmpty()){
26            sum+=st.pop();
27        }
28        return sum;
29
30    }
31}