class Solution {
    public int solution(int num) {
        if (num == 1) return 0;
        int answer = 0;
        
        while(true) {
            
            if(num % 2 == 0) {
                num /= 2;
            } else if(num % 2 == 1) {
                num = num * 3 + 1;
            }
            
            answer++;
            
            if(num == 1) {
                break;
            }
            
            if(answer == 500) {
                answer = -1;
                break;
            }
        }
        
        return answer;
    }
}