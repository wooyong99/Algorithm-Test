import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0 ;i<sizes.length; i++){
            int big = sizes[i][0];
            int small = sizes[i][1];
            if(sizes[i][0] < sizes[i][1]){
                big = sizes[i][1];
                small = sizes[i][0];
            }
            if(map.containsKey(big) && map.get(big) > small){
                continue;
            }
            map.put(big,small);
        }
        
        List<Integer> w_list = new ArrayList<>(map.keySet());
        Collections.sort(w_list, new Comparator<Integer> (){
            @Override
            public int compare(Integer a, Integer b){
                return b-a;
            }
        });
        
        List<Integer> h_list = new ArrayList<>(map.values());
        Collections.sort(h_list, new Comparator<Integer> (){
            @Override
            public int compare(Integer a, Integer b){
                return b-a;
            }
        });
        answer = h_list.get(0) * w_list.get(0);
        return answer;
    }
}