class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] words = s.split(" ", -1); 

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (word.length() != 0) {
                char firstChar = word.charAt(0);
                if(Character.isDigit(firstChar)) {
                    answer.append(word.toLowerCase());
                }else {
                    answer.append(Character.toUpperCase(firstChar));
                    answer.append(word.substring(1).toLowerCase());
                }
            }

            if (i < words.length - 1) {
                answer.append(" ");
            }
        }

        return answer.toString();
    }
}