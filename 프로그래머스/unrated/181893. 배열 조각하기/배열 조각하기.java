import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i<arr.length; i++){
            list.add(arr[i]);    
        }
        
        for(int i = 0;i<query.length; i++){
            if(i%2==0){
                int temp = list.get(query[i]);
                list = list.subList(0, query[i]);
                list.add(temp);
            }else{
                int temp = list.get(query[i]);
                list = list.subList(query[i], list.size());
                list.set(0,temp);
            }
        }
        
        return list.stream().mapToInt(e->(int)e).toArray();
    }
}