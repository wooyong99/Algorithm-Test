import java.util.HashMap;
import java.util.Map.*;
import java.util.Set;
import java.util.stream.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String,Integer> list = new HashMap<>();
        for(int i = 0; i<players.length; i++){
            list.put(players[i], i);
        }
        
        for(String name : callings){
            int idx = list.get(name);
            Set<Entry<String, Integer>> entrySet = list.entrySet();
            for (Entry<String, Integer> entry : entrySet) {
                if (entry.getValue().equals(idx-1)) {
                    list.put(entry.getKey(), idx);
                    list.put(name, idx-1);
                }
            }
            
        }

        Set<Entry<String,Integer>> entrySet = list.entrySet();
        entrySet.forEach(System.out::println);
        
        
        return null;
    }
}