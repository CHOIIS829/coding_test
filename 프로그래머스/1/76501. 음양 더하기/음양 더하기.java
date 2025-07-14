import java.util.*;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        int max = absolutes.length;
        
        for(int i = 0; i < max; i++) {
            int num = absolutes[i];
            boolean sign = signs[i];
            
            if(!sign) {
                num = -num;
            }
            
            answer += num;
        }
        
        return answer;
    }
}