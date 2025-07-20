import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for(int i = 1; i <= Math.sqrt(yellow); i++) {
            if(yellow % i == 0) {
                int w = yellow / i;
                int width = w + 2;
                int height = i + 2;
                
                if(width * height - yellow == brown) {
                    answer[0] = width;
                    answer[1] = height;
                }
            }
        }
        
        return answer;
    }
}