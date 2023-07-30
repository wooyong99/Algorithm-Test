import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int[] temp = Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr);
        int min = arr[0];
        
        answer = new int[temp.length-1];
        int idx = 0;
        
        for(int num : temp){
            if(num == min){
                continue;
            }else{
                answer[idx] = num;
                idx++;
            }
        }
        if(answer.length == 0){
            answer = new int[1];
            answer[0] = -1;
        }
        
                
    
        return answer;
    }
}