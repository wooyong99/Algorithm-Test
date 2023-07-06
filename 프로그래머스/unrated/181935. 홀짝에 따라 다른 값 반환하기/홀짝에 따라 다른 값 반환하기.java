class Solution {
    public int solution(int n) {
        if(n%2 != 0){
            return odd(n);
        }else{
            return even(n);
        }
    }
    public int even(int num){
        int sum = 0;
        for(int i = 0; i<=num; i++){
            if(i % 2 == 0){
                sum+=Math.pow(i,2);
            }
        }
        return sum;
    }
    public int odd(int num){
        int sum = 0;
        for(int i = 0; i<=num; i++){
            if(i % 2 != 0 ){
                sum+=i;
            }
        }
        return sum;
    }
}