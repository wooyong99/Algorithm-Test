class Solution {
    public int solution(int a, int b, int n) {
        int rs = 0;
        while(n >= a){
            int get_cola = (n/a)*b;
            n = n + get_cola - (n/a*a);    
            rs += get_cola;
        }
        return rs;
    }
}