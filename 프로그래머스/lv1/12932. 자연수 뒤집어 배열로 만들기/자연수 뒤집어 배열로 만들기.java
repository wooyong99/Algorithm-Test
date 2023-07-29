class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        
        StringBuilder str_num = new StringBuilder(String.valueOf(n));
        
        answer= new int[str_num.length()];
        
        str_num.reverse();
        
        for(int i = 0; i<str_num.length(); i++){
            answer[i] = Integer.parseInt(String.valueOf(str_num.charAt(i)));
        }
        
        return answer;
    }
}