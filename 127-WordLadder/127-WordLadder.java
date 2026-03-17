// Last updated: 3/17/2026, 3:30:01 PM
1class Solution {
2    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
3        return answer(beginWord, endWord, wordList);
4    }
5
6    public List<String> DifferByOne(String s, HashSet<String> set){
7        List<String> ans = new ArrayList<>();
8        // int d =0;
9        for(int i=0 ;i<s.length() ;i++){
10            
11            char c = s.charAt(i);
12            for(char ch = 'a' ;ch <='z' ;ch++){
13               if(ch == c){
14                    continue;
15               }
16               String newWord = s.substring(0,i)+ ch + s.substring(i+1);
17                if(set.contains(newWord)){
18                    ans.add(newWord);
19                }
20            }
21        }
22        return ans;
23        
24    }
25
26    public int answer(String start, String end, List<String> word){
27        HashSet<String> set = new HashSet<>();
28        for(String a : word){
29            set.add(a);
30        }
31        set.add(start);
32        if( ! set.contains(end)){
33            return 0;
34        }
35
36        //create graph
37        HashMap<String, List<String>> map = new HashMap<>();
38        for(String s : set){
39            List<String> nbrs  = DifferByOne(s, set);
40            map.put(s, nbrs);
41        }
42
43        //bfs
44        Queue<String> q= new LinkedList<>();
45        HashSet<String> visited = new HashSet<>();
46        q.add(start);
47        visited.add(start);
48        int level = 1;
49
50        while(!q.isEmpty()){
51            
52            int size =q.size();
53
54            for(int i=0 ;i<size ;i++){
55                String r = q.poll();
56            
57                visited.add(r);
58                
59                if(r.equals(end)){
60                    return level;
61                }
62                for(String nbrs : map.get(r)){
63                    if(!visited.contains(nbrs)){
64                        q.add(nbrs);
65                        
66                    }
67                }
68            }
69            level++;
70        }
71
72        return 0;
73    }
74}