import java.util.stream.IntStream;
import java.util.stream.Stream;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        return Stream.of(queries)
            .map(e -> IntStream.rangeClosed(e[0],e[1])
                 .map(a -> arr[a])
                 .filter(k -> e[2] < k)
                 .min()
                )
            .mapToInt(e -> e.orElse(-1))
            .toArray();
    }
}