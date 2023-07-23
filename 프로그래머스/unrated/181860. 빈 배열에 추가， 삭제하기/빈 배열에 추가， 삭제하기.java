import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        for(int i =0 ; i<flag.length; i++){
            if(flag[i]){
                for(int j = 0; j<arr[i]*2; j++){
                    stack.push(arr[i]);
                }
            }else{
                for(int q = 0; q<arr[i]; q++){
                    stack.pop();
                }
            }
        }
        
        return stack.stream().mapToInt(e->(int)e).toArray();
    }
}