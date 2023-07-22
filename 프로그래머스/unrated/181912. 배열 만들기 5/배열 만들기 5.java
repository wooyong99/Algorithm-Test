import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0 ; i< intStrs.length; i++){
            int rangeNum = Integer.parseInt(intStrs[i].substring(s, s+l));
            if(rangeNum > k){
                list.add(rangeNum);
            }
            
        }
        
        return list.stream().mapToInt(e->(int)e).toArray();
    }
}