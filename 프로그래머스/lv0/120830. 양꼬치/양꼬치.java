class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        int sale_num = n / 10;
        k -= sale_num;
        System.out.println(sale_num);
        int n_price = 12000*n;
        int k_price = 2000*k;
        
        answer = n_price + k_price;
        
        return answer;
    }
}