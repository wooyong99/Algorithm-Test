import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                list.add(arr[i]);
            }
        }
        Collections.sort(list);
        if(list.size() == 0){
            list.add(-1);
        }
        answer = list.stream().mapToInt(e->(int)e).toArray();
        return answer;
    }
}