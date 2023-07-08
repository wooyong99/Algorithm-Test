import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> rs = new ArrayList<>();
        for(int[] querie : queries){
            int s = querie[0];
            int e = querie[1];
            int k = querie[2];
            List<Integer> list = new ArrayList<>();
            for(int i = s ; i<=e; i++){
                if(arr[i] > k){
                    list.add(arr[i]);
                }
            }
            if(list.isEmpty()){
                rs.add(-1);
            }else{
                Collections.sort(list);
                rs.add(list.get(0));
            }
        }
        return rs.stream().mapToInt(e->(int)e).toArray();
    }
}