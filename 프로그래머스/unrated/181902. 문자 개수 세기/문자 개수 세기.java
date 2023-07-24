class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(int i = 0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            if(Character.isUpperCase(c)){
                int idx = (int)c-65;
                answer[idx]++;
            }else{
                int idx = (int)c-71;
                answer[idx]++;
            }
        }
        return answer;
    }
}