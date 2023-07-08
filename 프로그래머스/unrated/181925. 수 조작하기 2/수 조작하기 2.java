import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;

class Solution {
    public String solution(int[] numLog) {
        List<Integer> list = IntStream.of(numLog)
                .boxed()
                .collect(Collectors.toList());
        String rs = "";
        for(int i = 0; i<list.size()-1; i++){
            int calcu = list.get(i+1)-list.get(i);
            if( calcu == 1 ){
                rs += "w";
            }else if (calcu == -1){
                rs+= "s";
            }else if (calcu == 10){
                rs+= "d";
            }else{
                rs+= "a";
            }
        }
        return rs;
    }
}