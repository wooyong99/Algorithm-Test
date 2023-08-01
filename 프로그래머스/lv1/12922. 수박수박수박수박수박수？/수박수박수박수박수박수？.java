class Solution {
    public String solution(int n) {
        String answer = "";
        
        boolean flag = true;
        
        for(int i = 0 ; i<n; i++){
            if(flag){
                answer+="수";
            }else{
                answer+="박";
            }
            flag = !flag;
        }
        
        
        return answer;
    }
}