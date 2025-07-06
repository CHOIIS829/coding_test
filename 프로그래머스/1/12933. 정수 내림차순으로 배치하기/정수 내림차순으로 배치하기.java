import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        List<Integer> nums = new ArrayList<>();
        
        while(n > 0) {
            nums.add((int)(n % 10));
            n /= 10;
        }
        
        nums.sort(Collections.reverseOrder());
        
        for(int num : nums) {
            answer = answer * 10 + num;
        }
        
        return answer;
    }
}