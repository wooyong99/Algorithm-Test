import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack();
        for(int i = 0; i<arr.length; i++){
            if(stack.size() == 0){
                stack.push(arr[i]);
            }else if(stack.lastElement() == arr[i]){
                stack.pop();
            }else if(stack.lastElement() != arr[i]){
                stack.push(arr[i]);
            }
        }
        if(stack.size() == 0){
            stack.push(-1);
        }
        return stack.stream().mapToInt(e->(int)e).toArray();
    }
}