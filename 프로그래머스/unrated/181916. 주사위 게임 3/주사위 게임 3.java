import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int solution(int a, int b, int c, int d) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        IntStream.of(a,b,c,d)
                .mapToObj(e->Integer.valueOf(e))
                .collect(Collectors.toList())
                .forEach(n -> {
                    if(!numMap.containsKey(n)){
                        numMap.put(n, 1);
                    }else{
                        numMap.put(n, numMap.get(n)+1);
                    }
                });
        int p=0;
        int q=0;
        if(numMap.containsValue(4)){
            for(int num : numMap.keySet()){
                if(numMap.get(num) == 4){
                    return num * 1111;
                }
            }
        }else if(numMap.containsValue(3)){
            for(int num : numMap.keySet()){
                if(numMap.get(num) == 3){
                    p = num;
                }else if( numMap.get(num) == 1){
                    q = num;
                }
            }
            return (10*p+q)*(10*p+q);
        }else if(numMap.size() == 2 && numMap.containsValue(2)){
            Integer[] arr = numMap.keySet().toArray(new Integer[0]);
            return (arr[0]+arr[1]) * Math.abs(arr[0]-arr[1]);
        }else if(numMap.containsValue(2)){
            int[] arr = numMap.keySet().stream().filter(e -> numMap.get(e)!=2 ).mapToInt(e -> (int)e).toArray();
            return arr[0] * arr[1];
        }
        int min = numMap.keySet().stream().mapToInt(e -> (int)e).min().getAsInt();
        return min;
        
}
}