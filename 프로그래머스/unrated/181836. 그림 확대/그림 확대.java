import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i<picture.length; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0 ; j<picture[i].length(); j++){
                sb.append(String.valueOf(picture[i].charAt(j)).repeat(k));
            }
            for(int a = 0; a<k; a++){
                list.add(sb.toString());
            }
        }
        
        return list.toArray(new String[list.size()]);
    }
}