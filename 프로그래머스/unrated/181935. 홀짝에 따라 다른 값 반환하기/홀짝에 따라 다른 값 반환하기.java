import java.util.stream.*;
class Solution {
    public int solution(int n) {
        if(n % 2 == 0){
            return IntStream.rangeClosed(1,n)
                .filter( i -> i%2==0)
                .map(i -> (int)Math.pow(i,2))
                .sum();
        }else{
            return IntStream.rangeClosed(1,n)
                .filter(i -> i%2!=0)
                .sum();
        }
    }
}