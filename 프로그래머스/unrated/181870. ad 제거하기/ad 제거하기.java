class Solution {
    public String[] solution(String[] strArr) {
        int cnt = 0;
        for(int i = 0; i<strArr.length; i++){
            if(!strArr[i].contains("ad")){
                cnt++;
            }
        }
        String[] answer = new String[cnt];
        
        int idx = 0;
        for(int i = 0; i<strArr.length; i++){
            if(!strArr[i].contains("ad")){
                answer[idx] = strArr[i];
                idx++;
            }
        }
        
        
        
        return answer;
    }
}