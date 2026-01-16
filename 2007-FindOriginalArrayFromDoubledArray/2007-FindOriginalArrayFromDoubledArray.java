// Last updated: 1/16/2026, 10:15:04 PM
1class Solution {
2    public int[] findOriginalArray(int[] changed) {
3
4        return answer(changed);
5    }
6    public static int[] answer(int[] changed){
7        int n = changed.length;
8        if (n % 2 != 0) return new int[0];
9
10        Arrays.sort(changed);
11        Map<Integer, Integer> freq = new HashMap<>();
12
13        for (int x : changed) {
14            freq.put(x, freq.getOrDefault(x, 0) + 1);
15        }
16
17        int[] original = new int[n / 2];
18        int idx = 0;
19
20        for (int x : changed) {
21            if (freq.get(x) == 0) continue;
22
23            if (x == 0) {
24                if (freq.get(x) < 2) return new int[0];
25                original[idx++] = 0;
26                freq.put(0, freq.get(0) - 2);
27            } else {
28                if (freq.getOrDefault(2 * x, 0) == 0)
29                    return new int[0];
30
31                original[idx++] = x;
32                freq.put(x, freq.get(x) - 1);
33                freq.put(2 * x, freq.get(2 * x) - 1);
34            }
35        }
36
37        return original;
38       
39
40    }
41}