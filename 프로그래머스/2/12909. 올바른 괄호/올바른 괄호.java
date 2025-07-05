class Solution {
    boolean solution(String s) {
        boolean answer = false;

        char[] arr = s.toCharArray();
        int count = 0;
        
        for(char c : arr) {
            if(c == '(') {
                count++;
            } else {
                count--;
            }
            if(count < 0) {
                return false;
            }
        }
        if(count == 0) {
            answer = true;
        }

        return answer;
    }
}