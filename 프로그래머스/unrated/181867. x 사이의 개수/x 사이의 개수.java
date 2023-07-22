import java.util.*;

class Solution {
    public int[] solution(String myString) {
        String[] arr = myString.split("x",-1);
        int[] answer = new int[arr.length];
        Arrays.stream(answer).forEach(System.out::println);
        for(int i = 0; i<arr.length; i++){
            answer[i] = arr[i].length();
        }
        
        
        
        return answer;
    }
}