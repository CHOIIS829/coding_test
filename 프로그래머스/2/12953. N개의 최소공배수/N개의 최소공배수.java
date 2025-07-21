import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        
        for(int i = 1; i < arr.length; i++) {
            int a = answer;
            int b = arr[i];
            
            while(b != 0) {
                int c = a % b;
                a = b;
                b = c;
            }
            int gcd = a;
            
            answer = answer * arr[i] / gcd;
        }
        
        return answer;
    }
}