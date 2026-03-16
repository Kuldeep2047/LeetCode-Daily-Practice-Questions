// Last updated: 3/16/2026, 10:36:03 AM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> neighbors;
6    public Node() {
7        val = 0;
8        neighbors = new ArrayList<Node>();
9    }
10    public Node(int _val) {
11        val = _val;
12        neighbors = new ArrayList<Node>();
13    }
14    public Node(int _val, ArrayList<Node> _neighbors) {
15        val = _val;
16        neighbors = _neighbors;
17    }
18}
19*/
20
21class Solution {
22    public Node cloneGraph(Node node) {
23        return answer(node);
24    }
25    public Node answer(Node node){
26        if(node == null){
27            return null;
28        }
29        Stack<Node> st = new Stack<>();
30        HashMap<Node, Node> map = new HashMap<>();
31
32        //apply dfs
33        st.push(node);
34        map.put(node, new Node(node.val));
35
36        while(!st.isEmpty()){
37            Node r= st.pop();
38
39            for(Node nbrs : r.neighbors){
40                if(!map.containsKey(nbrs)){
41                    map.put(nbrs ,new Node(nbrs.val));
42                    st.push(nbrs);
43                }
44                map.get(r).neighbors.add(map.get(nbrs));
45            }
46        }
47        return map.get(node);
48
49    }
50}