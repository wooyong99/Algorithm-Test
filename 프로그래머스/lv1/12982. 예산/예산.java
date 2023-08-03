import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<d.length; i++){
            list.add(d[i]);
        }
        Collections.sort(list);
        
        if(list.get(0) > budget){
            return 0;
        }
        
        int sum = 0;
        for(int i = 0; i<list.size(); i++){
            sum += list.get(i);
            System.out.println(sum);
            if ( sum==budget){
                answer = i+1;
                break;
            }else if(sum > budget){
                answer = i;
                break;
            }
        }
        
        if(answer == 0){
            answer = list.size();
        }
        return answer;
    }
}