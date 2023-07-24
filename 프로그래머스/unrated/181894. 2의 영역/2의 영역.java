import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i<arr.length; i++){
            list.add(arr[i]);
        }
        if(list.lastIndexOf(2) == list.indexOf(2) && list.lastIndexOf(2) != -1){
            answer = new int[]{2};
        }else if(list.indexOf(2) == -1){
            answer = new int[]{-1};
        }else{
            answer = new int[list.lastIndexOf(2) - list.indexOf(2) +1 ];
            int idx = 0;
            for(int i = list.indexOf(2); i<=list.lastIndexOf(2); i++){
                answer[idx] = arr[i];
                idx++;
            }    
        }
        
        return answer;
    }
}