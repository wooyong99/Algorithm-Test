import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<arr.length;){
            if(list.size() == 0){
                list.add(arr[i]);
                i++;
            }else if(list.size()>0 && list.get(list.size()-1) < arr[i]){
                list.add(arr[i]);
                i++;
            }else if(list.size()>0 && list.get(list.size()-1) >= arr[i]){
                list.remove(list.size()-1);
            }
        }
        return list.stream().mapToInt(e->e).toArray();
    }
}