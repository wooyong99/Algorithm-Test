import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList list = new ArrayList();
        for(int e : arr){
            for(int i = 0; i< e; i++){
                list.add(e);
            }
        }
        return list.stream().mapToInt(e->(int)e).toArray();
        
    }
}