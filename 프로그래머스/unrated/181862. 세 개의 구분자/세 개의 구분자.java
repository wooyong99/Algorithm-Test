import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Solution {
    public String[] solution(String myStr) {
        List<String> list = Stream.of(myStr.split("a|b|c")).collect(Collectors.toList());
        List<String> del = new ArrayList<>();
        del.add("");
        if(list.size() == 0){
            String[] rs = new String[1];
            rs[0] = "EMPTY";
            return rs;
        }else{
            list.removeAll(del);
        }
        
        return list.toArray(new String[list.size()]);
    }
}