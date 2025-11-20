class Solution {
    public int solution(int[] players, int m, int k) {
        
        int n = players.length;
        
        int[] times = new int[n + k + 2];
        
        int extra = 0;
        int answer = 0;

        for(int t = 0; t < n; t++) {
            extra += times[t];
            
            int req = players[t] / m;
            
            if(extra < req) {
                int addServer = req - extra;
                
                answer += addServer;
                extra += addServer;
                
                if(t + k < times.length) {
                    times[t + k] -= addServer;
                }
            }
        }
        
        
        return answer;
    }
}