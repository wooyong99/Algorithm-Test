class Solution {
    public String solution(String s) {
        String answer = "";
        int calc = s.length() % 2;
        int share = s.length() / 2;
        if(calc==0){
            answer = s.substring(share-1,share+1);
        }else{
            answer = s.substring(share, share+1);
        }
        
        return answer;
    }
}