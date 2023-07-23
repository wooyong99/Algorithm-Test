class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder(myString);
        int idx = 0;
        while(sb.indexOf(pat,idx) != -1){
            if(sb.indexOf(pat,idx) != -1){
                idx = sb.indexOf(pat,idx) +1;
                answer++;
            }
        }
        
        return answer;
    }
}