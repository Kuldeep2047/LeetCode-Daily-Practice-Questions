// Last updated: 2/5/2026, 12:55:38 PM
1class Solution {
2    static List<String> ll;
3    public List<String> findWords(char[][] maze, String[] words) {
4        ll = new ArrayList<>();
5        Trie t = new Trie();
6		for(String s : words) {
7			t.insert(s);
8		}
9		for(int i=0 ;i<maze.length;i++) {
10			for(int j=0 ;j<maze[0].length ;j++) {
11				if(t.root.child.containsKey(maze[i][j])) {
12					t.Search(maze, i, j, t.root);
13				}
14			}
15		}
16		return ll;
17    }
18    static class Trie{
19		class Node{
20			char ch;
21			String isTerminal;
22			HashMap<Character, Node> child;
23			public Node(char ch) {
24				this.ch = ch;
25				child = new HashMap<>();
26			}
27		}
28		Node root = new Node('*');
29		
30		public void insert(String word) {
31	        Node curr = root;
32	        for(int i=0 ;i<word.length();i++) {
33	        	char ch = word.charAt(i);
34	        	if(curr.child.containsKey(ch)) {
35	        		curr = curr.child.get(ch);
36	        	}
37	        	else {
38	        		Node nn = new Node(ch);
39	        		curr.child.put(ch,  nn);
40	        		curr = nn;
41	        	}
42	        }
43	        curr.isTerminal = word;
44	    }
45
46		public static void Search(char[][] maze, int i, int j, Node node) {
47			// TODO Auto-generated method stub
48			if(i<0 || j<0 || j>=maze[0].length ||i>=maze.length || !node.child.containsKey(maze[i][j])) {
49				return;
50			}
51			char ch = maze[i][j];
52			node = node.child.get(ch);
53			if(node.isTerminal != null) {
54				ll.add(node.isTerminal);
55				node.isTerminal = null;
56			}
57			maze[i][j] = '*';
58			
59			Search(maze, i+1, j, node);
60			Search(maze, i-1, j, node);
61			Search(maze, i, j+1, node);
62			Search(maze, i, j-1, node);
63			maze[i][j] = ch;
64			
65		}
66	}
67}