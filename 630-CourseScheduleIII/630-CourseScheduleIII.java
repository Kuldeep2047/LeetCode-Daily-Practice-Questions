// Last updated: 1/11/2026, 9:36:06 PM
1class Solution {
2    public int scheduleCourse(int[][] courses) {
3        return answer(courses);
4    }
5
6    public int answer(int[][] courses){
7        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
8
9        Arrays.sort(courses, (a,b)-> a[1]-b[1]);
10
11        int time=0;
12        for(int[] c :  courses){
13            time += c[0];
14            pq.add(c[0]);
15
16            if(time > c[1]){
17                int r = pq.poll();
18                time = time -r;
19            }
20        }
21
22        return pq.size();
23    }
24}