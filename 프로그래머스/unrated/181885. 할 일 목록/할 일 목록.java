import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        
        for(int i = 0 ; i<todo_list.length; i++){
            if(finished[i] == false){
                list.add(todo_list[i]);
            }
        }
        
        return list.toArray(new String[list.size()]);
    }
}