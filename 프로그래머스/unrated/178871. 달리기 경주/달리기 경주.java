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
            
            if (idx == 0) {
                continue;
            }            
            
            int idx2 = idx-1;
            String name2 = players[idx2];

            players[idx2] = name;
            players[idx] = name2;
            
            list.put(name, idx2);
            list.put(name2, idx);
            
        }

        
        return players;
    }
}