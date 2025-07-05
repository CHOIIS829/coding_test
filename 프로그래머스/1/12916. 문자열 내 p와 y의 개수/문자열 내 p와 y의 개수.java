class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String upper = s.toUpperCase();
        char[] arr = upper.toCharArray();
        
        int count1 = 0;
        int count2 = 0;
        
        for(char c : arr) {
            if(c == 'P'){
                count1++;
            }else if(c == 'Y'){
                count2++;
            }
        }
        
        answer = count1 == count2 ? true : false;

        return answer;
    }
}