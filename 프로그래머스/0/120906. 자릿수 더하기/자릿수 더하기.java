class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String numStr = Integer.toString(n);
        
        for(int i = 0; i < numStr.length(); i++) {
            int num = numStr.charAt(i) - '0';
            answer += num;
        }
        
        return answer;
    }
}