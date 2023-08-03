import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        if(numbers.length == 2){
            answer = new int[]{numbers[0]+numbers[1]};
            return answer;
        }
        for(int i = 0; i<numbers.length-1; i++){
            for(int j = i+1; j<numbers.length; j++){
                int sum = numbers[i] + numbers[j];
                list.add(sum);    
            }
        }
        Collections.sort(list);
        Set<Integer> set = new HashSet<>(list);
        
        answer = set.stream().mapToInt(e->(int)e).toArray();
        Arrays.sort(answer);
        return answer;
    }
}