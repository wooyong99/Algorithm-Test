import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = n-1 ; i<num_list.length; i++){
            list.add(num_list[i]);
        }
        
        return list.stream().mapToInt(e->(int)e).toArray();
    }
}