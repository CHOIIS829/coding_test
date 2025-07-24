import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] arr = s.toCharArray();
        int length = s.length();
        
        if(length % 2 == 0) {
            char x = arr[length / 2 - 1];
            char y = arr[length / 2];
            answer = "" + x + y;
        } else {
            answer = String.valueOf(arr[length / 2]);    
        }
        
        return answer;
    }
}