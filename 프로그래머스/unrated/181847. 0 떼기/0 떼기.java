class Solution {
    public String solution(String n_str) {
        String answer = "";
        int end = 0;
        for(int i = 0 ; i<n_str.length(); i++){
            if(n_str.charAt(i) == '0'){
                continue;
            }else{
                end = i;
                break;
            }
        }
        answer = n_str.substring(end, n_str.length());
        return answer;
    }
}