class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for(int i = 0; i<order.length; i++){
            String od = order[i];
            if(od.contains("americano")){
               answer += 4500 ;
            }else if(od.contains("cafelatte")){
                answer += 5000;
            }else if(od.contains("anything")){
                answer+=4500;
            }
        }
        
        return answer;
    }
}