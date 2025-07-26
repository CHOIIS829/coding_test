import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int size = arr.length;

        if(size == 0) {
            return new int[]{-1};
        }

        int[] newArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(newArr);

        if(size == 1) {
            return new int[]{-1};
        }

        int[] answer = new int[size - 1];
        int index = 0;

        for(int num : arr) {
            if(num != newArr[0]) {
                answer[index++] = num;
            }
        }

        return answer;
    }
}