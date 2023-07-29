class Solution {
    public long solution(long n) {
        long answer = 0;
        
        long last = (long)Math.sqrt(n);
        
        for(int i = 1; i<=last; i++){
            if(Math.pow(i,2) == n){
                answer = (long)Math.pow(i+1, 2);
                break;
            }
        }
        
        if(answer == (long)0){
            answer = -1;
        }
        
        return answer;
    }
}