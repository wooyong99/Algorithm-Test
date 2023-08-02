class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        
        answer = new int[2];
        
        int num1 = func1(n,m);
        int num2 = func2(n,m);
        
        answer[0] = num1;
        answer[1] = num2;
        
        return answer;
    }
    public int func1(int n, int m){
        int rs = 0;
        for(int i =n; i>=1; i--){
            if(n % i == 0 & m % i ==0){
                rs = i;
                break;
            }
        }
        return rs;
    }
    public int func2(int n, int m){
        int rs = 0;
        for(int i =m; i<=n*m; i++){
            if(i % n ==0 & i % m ==0){
                rs = i;
                break;
            }
        }
        return rs;
    }
}