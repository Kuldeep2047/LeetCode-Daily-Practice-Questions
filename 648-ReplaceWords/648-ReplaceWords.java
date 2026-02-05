// Last updated: 2/5/2026, 12:16:57 PM
1class Solution {
2    public  String replaceWords(List<String> Dictionary, String sentence) {
3        Trie t= new Trie();
4		for(String s : Dictionary) {
5			t.insert(s);
6        }
7		String[] arr = sentence.split(" ");
8		StringBuilder sb = new StringBuilder();
9		for(int i=0 ;i<arr.length ;i++) {
10			String get = t.search(arr[i]);
11			sb.append(get+ " ");
12		}
13		return sb.toString().trim();
14    }
15    static class Trie{
16		class Node{
17			char ch;
18			String isTerminal;
19			HashMap<Character, Node> child;
20			public Node(char ch) {
21				this.ch = ch;
22				child = new HashMap<>();
23			}
24		}
25		private Node root = new Node('*');
26		
27		public void insert(String word) {
28	        Node curr = root;
29	        for(int i=0 ;i<word.length();i++) {
30	        	char ch = word.charAt(i);
31	        	if(curr.child.containsKey(ch)) {
32	        		curr = curr.child.get(ch);
33	        	}
34	        	else {
35	        		Node nn = new Node(ch);
36	        		curr.child.put(ch,  nn);
37	        		curr = nn;
38	        	}
39	        }
40	        curr.isTerminal = word;
41	    }
42		
43		public String search(String word) {
44	    	Node curr = root;
45	        for(int i=0 ;i<word.length() ;i++) {
46	        	char ch = word.charAt(i);
47	        	if(curr.child.containsKey(ch)) {
48	        		curr = curr.child.get(ch);
49	        		if(curr.isTerminal != null) {
50	        			return curr.isTerminal;
51	        		}
52	        	}
53	        	else {
54	        		return word;
55	        	}
56	        }
57	        return word;
58	    }
59		
60	}
61}