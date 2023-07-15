import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>(); //스택
        for(int num : arr){
            if(list.size() == 0){
                list.add(num);
            }else{
                if(list.get(list.size() - 1) == num){
                    continue;
                }else{
                    list.add(num);
                }
            }
        }
        return list.stream().mapToInt(e->(int)e).toArray();
    }
}