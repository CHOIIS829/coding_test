import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        
        List<String> arr = new ArrayList<>();
        arr.add(words[0]);
        
        
        for(int i = 1; i < words.length; i++) {
            String prev = words[i-1];
            String curr = words[i];
            
            if(prev.charAt(prev.length() -1) != curr.charAt(0)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                return answer;
            }
            
            if(arr.contains(curr)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                return answer;
            }
            
            arr.add(curr);
        }

        return answer;
    }
}