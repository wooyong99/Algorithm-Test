class Solution {
    static int cnt = 0;
    public int solution(int left, int right) {
        int sum = 0;
        for(int i = left; i<=right; i++){
            cnt =0;
            getCnt(i,1);
            if(cnt % 2==0){
                sum += i;
            }else{
                sum -= i;
            }
        }
        return sum;
    }
    public static void getCnt(int num, int min){
        if(min > num){
            return;
        }
        if( num % min == 0){
            cnt++;
        }
        getCnt(num, min+1);
    }
}