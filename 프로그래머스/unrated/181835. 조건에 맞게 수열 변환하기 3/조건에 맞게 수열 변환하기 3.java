import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int k) {
        if(k % 2 == 0){
            return IntStream.of(arr)
                .map(e->e+k)
                .toArray();
        }else{
            return IntStream.of(arr)
                .map(e->e*k)
                .toArray();
        }
    }
}