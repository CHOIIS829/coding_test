import java.util.*;

class Solution {
    public int solution(int n) {
        List<Integer> ls = new ArrayList<>();
        
        for(int i = 1; i <= n; i++) {
            if(n%i == 0) {
                ls.add(i);
            }
        }
        
        return ls.size();
    }
}