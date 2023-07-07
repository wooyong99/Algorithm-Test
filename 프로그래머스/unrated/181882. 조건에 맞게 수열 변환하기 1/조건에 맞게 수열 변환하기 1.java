import java.util.stream.*;
class Solution {
    public int[] solution(int[] arr) {
        return IntStream.of(arr)
            .map(e-> (e>=50 && e%2==0) ? e/2 : (e<50 && e%2!=0) ? e*2 :e)
            .toArray();
    }
}