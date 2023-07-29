import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i<arr.length; i++){
            if(list.contains(arr[i])){
                continue;
            }else{
                list.add(arr[i]);
            }
        }
        for(int i = 0 ;i<answer.length; i++){
            if(list.size() > i){
                answer[i] = list.get(i);    
            }else{
                answer[i] = -1;
            }
            
        }
        
        
        
        return answer;
    }
}