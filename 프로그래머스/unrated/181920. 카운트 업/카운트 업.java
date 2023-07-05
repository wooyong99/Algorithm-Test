class Solution {
    public int[] solution(int start, int end) {
        int cnt = end - start + 1;
        int[] answer = new int[cnt];
        for(int i = 0; i < cnt; i++){
            answer[i] = start + i;
        }
        return answer;
    }
}