class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        
        for (int i = 0; i < k; i++) {
            if(1<=my_string.length() && my_string.length()<=100){
            answer += my_string;
            }
        }
        
        return answer;
    }
}