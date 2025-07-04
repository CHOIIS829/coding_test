import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split(" ");
        List<Integer> newArr = new ArrayList<>();
        
        for(String strNum : arr) {
            int num = Integer.parseInt(strNum);
            newArr.add(num);    
        }
        
        Collections.sort(newArr);
        
        int min = newArr.get(0);
        int max = newArr.get(newArr.size()-1);
        
        return min + " " + max;
    }
}