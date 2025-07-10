import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        int[][] minTime = new int[book_time.length][2];
        
        for(int i = 0; i < book_time.length; i++) {
            for(int j = 0; j < 2; j++) {
                int min = toMinutes(book_time[i][j]);
                minTime[i][j] = min;
            }
        }
        
        Arrays.sort(minTime, Comparator.comparingInt(o -> o[0]));
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int[] time : minTime) {
            int start = time[0];
            int end = time[1] + 10;
            
            if(!pq.isEmpty() && pq.peek() <= start) {
                pq.poll();
            }
            pq.offer(end);
        }
        
        return pq.size();
    }
    
    private int toMinutes(String time) {
        String[] a = time.split(":");
        return Integer.parseInt(a[0]) * 60 + Integer.parseInt(a[1]);
    }
}