class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long input = x;
        long increse_num = x;
        for(int i = 0 ; i<answer.length; i++){
            answer[i] = input;
            input+=increse_num;
        }
        return answer;
    }
}