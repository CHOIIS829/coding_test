class Solution {
    public int solution(int n, int w, int num) {
    
        int boxIndex = num - 1; 
        int row = boxIndex / w; 
        int col = (row % 2 == 0) ? boxIndex % w : w - 1 - (boxIndex % w);
        int totalRow = (n + w - 1) / w;
        int count = 0; 
        
        for(int i = row + 1; i < totalRow; i++) {
            int newCol = (i % 2 == 0) ? col : w - 1 - col;
            int topIndex = i * w + newCol;
            if(topIndex < n) {
                count++;
            }
        }
        return count + 1;
    }
}