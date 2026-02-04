// Last updated: 2/4/2026, 12:20:42 PM
1public class Trie {
2
3	class Node{
4		char ch;
5		boolean isterminal;
6		HashMap<Character, Node> child;
7		
8		public Node(char ch) {
9			this.ch = ch;
10			child = new HashMap<>();
11		}
12	}
13	private Node root;
14	
15	public Trie() {
16		root = new Node('*');
17	}
18	
19	public void insert(String word) {
20        Node curr = root;
21        for(int i=0 ;i<word.length();i++) {
22        	char ch = word.charAt(i);
23        	if(curr.child.containsKey(ch)) {
24        		curr = curr.child.get(ch);
25        	}
26        	else {
27        		Node nn = new Node(ch);
28        		curr.child.put(ch,  nn);
29        		curr = nn;
30        	}
31        }
32        curr.isterminal = true;
33    }
34	
35    public boolean search(String word) {
36    	Node curr = root;
37        for(int i=0 ;i<word.length();i++) {
38        	char ch = word.charAt(i);
39        	if(curr.child.containsKey(ch)) {
40        		curr = curr.child.get(ch);
41        	}
42        	else {
43        		return false;
44        	}
45        }
46        return curr.isterminal;
47    }
48    
49    public boolean startsWith(String prefix) {
50    	Node curr = root;
51        for(int i=0 ;i<prefix.length();i++) {
52        	char ch = prefix.charAt(i);
53        	if(curr.child.containsKey(ch)) {
54        		curr = curr.child.get(ch);
55        	}
56        	else {
57        		return false;
58        	}
59        }
60        return true;
61    }
62
63}
64
65/**
66 * Your Trie object will be instantiated and called as such:
67 * Trie obj = new Trie();
68 * obj.insert(word);
69 * boolean param_2 = obj.search(word);
70 * boolean param_3 = obj.startsWith(prefix);
71 */