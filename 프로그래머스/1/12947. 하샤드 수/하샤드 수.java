import java.util.*;

class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int original = x;
        List<Integer> arr = new ArrayList<>();
        
        while(x > 0) {
            arr.add(x % 10);
            x /= 10;
        }
        
        int sum = 0;
        
        for(int a : arr) {
            sum += a;
        }
        
        return original % sum == 0;
    }
}