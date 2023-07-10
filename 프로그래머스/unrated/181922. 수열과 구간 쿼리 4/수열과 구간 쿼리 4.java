import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        AtomicInteger idx = new AtomicInteger();
        int[] rs = arr.clone();
        Stream.of(queries)
            .map(e-> IntStream.of(arr)
                    .map(a -> {
                        int index = idx.getAndIncrement() % arr.length;
                        // System.out.println("index : "+index+" / a :"+a);
                        int value = (index >= e[0] && index<=e[1]) ?
                               ((index%e[2]==0 || index==0) ? a+1 : a) : a;
                        // arr[index%arr.length] = value;
                        return value;
                    }
                    )
                    .toArray()
                    // .map(a -> {
                    //     int index = idx.getAndIncrement();
                    //     System.out.println("index : "+index+" / a :"+a);
                    //     int value = (index%arr.length>= e[0] &&index%arr.length <= e[1]) ?
                    //            ((a%e[2]==0 && a/e[2]>=0 || a==0) ? a+1 : a) : a;
                    //     // arr[index%arr.length] = value;
                    //     return value;
                    // }
                    // )
                    // .toArray()
                 
                )
            .forEach(n->{for(int i=0; i<arr.length;i++){
                if(arr[i] != n[i]){
                    rs[i]++;
                }
            }}
        );
        return rs;
    }
}