class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        for(int i = 1; i<=count; i++){
            if(i != 1){
                answer = answer + (price * i);    
            }else{
                answer = price;
            }
        }
        return answer - money >= 0 ? answer - money : 0;
    }
}