import java.util.*;



class Solution {
    public String[] solution(String myStr) {
        StringTokenizer st = new StringTokenizer(myStr, "a|b|c");
        String[] answer = new String[st.countTokens()];
        if(st.countTokens() == 0){
            String[] answer2 = new String[1];
            answer2[0] = "EMPTY";
            return answer2;
        }
        for(int i = 0 ;i<answer.length; i++){
            answer[i] = st.nextToken();
        }
        return answer;
    }
}