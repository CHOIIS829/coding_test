

class Solution {
    public int[] solution(long n) {
        
        
        String x = String.valueOf(n);
        
        int[] answer = new int[x.length()];
        
        for(int i = 0; i < x.length(); i++) {
            answer[i] = x.charAt(x.length() - 1 - i) - '0';
        }
        
        return answer;
    }
}