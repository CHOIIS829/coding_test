class Solution {
    public int[] solution(String s) {
        int count = 0;
        int remove = 0;
        
        while(!s.equals("1")) {
            int zero = 0;
            for(char c : s.toCharArray()) {
                if(c == '0') zero++;
            }
            remove += zero;
            
            int i = s.length() - zero;
            s = Integer.toBinaryString(i);
            
            count++;
        }
        
        return new int[]{count, remove};
    }
}