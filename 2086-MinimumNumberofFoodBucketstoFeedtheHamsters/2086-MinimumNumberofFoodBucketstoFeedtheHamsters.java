// Last updated: 1/5/2026, 10:06:36 PM
1class Solution {
2    public int minimumBuckets(String hamsters) {
3        return answer(hamsters);
4    }
5
6    public int answer(String s){
7        int n = s.length();
8        int buckets = 0;
9        HashSet<Integer> set = new HashSet<>();
10
11        for (int i = 0; i < n; ) {
12
13            if (s.charAt(i) == 'H') {
14                if ((i - 1 >= 0 && set.contains(i - 1)) ||(i + 1 < n && set.contains(i + 1))) {
15                    i++;
16                    continue;
17                }
18
19                if(i + 1 < n && s.charAt(i + 1) == '.'){
20                    buckets++;
21                    set.add(i + 1);
22                    i = i + 2; 
23                }
24                else if(i - 1 >= 0 && s.charAt(i - 1) == '.'){
25                        buckets++;
26                        set.add(i - 1);
27                        i = i + 1;
28                }
29                else{
30                    return -1;
31                }
32            }
33            else{
34                i++;
35            }
36        }
37        return buckets;
38    }
39}