import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int[] idx = new int[3];
        Map<Integer, Boolean> map = new HashMap<>();
        
        for(int i = 0; i<rank.length; i++){
            if(attendance[i] == true){
                map.put(rank[i], attendance[i]);    
            }
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                return o1-o2;
            }
        });
        
        for(int i = 0 ; i<3; i++){
            for(int j = 0; j<rank.length; j++){
                if(list.get(i) == rank[j]){
                    idx[i] = j;
                }    
            }
            
        }
        answer = (idx[0]*10000) + (idx[1]*100) +idx[2];
        return answer;
    }
}