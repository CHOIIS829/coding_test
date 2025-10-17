class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for(int i = 1; i < food.length; i++) {
            int num = food[i] / 2;
            for(int k = 0; k < num; k++) {
                answer += String.valueOf(i);
            }
        }
        
        String reverse = new StringBuilder(answer).reverse().toString();
        
        return answer + "0" + reverse;
    }
}